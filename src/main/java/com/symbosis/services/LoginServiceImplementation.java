package com.symbosis.services;

import com.symbosis.model.Logins;
import com.symbosis.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImplementation implements LoginServiceInterface{
    @Autowired
    LoginRepository loginRepo;

//    @Override
//    public Logins userLogin(Logins login) {
//        return loginRepo.save(login);
//    }

    @Override
    public  Logins userfindByEmail(String email)
    {
        return loginRepo.findByEmail(email);
    }
}
