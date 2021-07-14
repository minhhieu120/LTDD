package com.example.quanlysinhvienute;

public class Account {
    public String name,pass,email,phone;
    public Account(String name, String pass, String email, String phone){
        this.email=email;
        this.name=name;
        this.phone=phone;
        this.pass=pass;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
