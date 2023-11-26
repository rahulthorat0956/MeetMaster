package com.symbosis.services;

import com.symbosis.model.Registers;
import com.symbosis.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisterserviceImplementation implements RegisterServiceInterface{

    @Autowired
    RegisterRepository registerRepo;
    @Override
    public Registers saveUser(Registers register) {
        validatePasswordMatch(register.getPassword(), register.getRepetPassword());
        Optional<Registers>already =registerRepo.findByEmail(register.getEmail());
        if(already.isPresent()){
            throw new IllegalArgumentException("Email is already registered");
        }else{
            return registerRepo.save(register);
        }

    }

    private void validatePasswordMatch(String password, String repetPassword) {
        if (!password.equals(repetPassword)) {
            throw new IllegalArgumentException("Password and repetPassword do not match");
        }
    }
}
