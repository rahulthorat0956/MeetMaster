package com.symbosis.repository;

import com.symbosis.model.Registers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterRepository extends JpaRepository<Registers,Integer> {
    Optional<Registers> findByEmail(String email);

}
