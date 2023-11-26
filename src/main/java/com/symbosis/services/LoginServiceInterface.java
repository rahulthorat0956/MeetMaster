package com.symbosis.services;

import com.symbosis.model.Logins;

public interface LoginServiceInterface {
   // public Logins userLogin(Logins login);
    public  Logins userfindByEmail(String email);
}
