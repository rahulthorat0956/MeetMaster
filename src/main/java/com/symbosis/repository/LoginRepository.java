package com.symbosis.repository;

import com.symbosis.model.Logins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Logins,Integer> {
    Logins findByEmail(String email);
}
