package com.symbosis.model;

import jakarta.persistence.*;

@Entity
public class Registers {
    @Id
    private int id;
    private String name;
    private String email;
    private  String password;
    private  String repetPassword;

    public Registers() {
    }

    public Registers(int id, String name, String email, String password, String repetPassword) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.repetPassword = repetPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepetPassword() {
        return repetPassword;
    }

    public void setRepetPassword(String repetPassword) {
        this.repetPassword = repetPassword;
    }
}
