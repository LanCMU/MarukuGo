package main.models;

import main.helpers.APPCrypt;

public class Token {

    String token = null;
    String userId = null;
    String firstName = null;
    String lastName = null;

    public Token(Driver driver) throws Exception{
        this.userId = driver.id;
        this.token = APPCrypt.encrypt(driver.id);
        this.firstName = driver.firstName;
        this.lastName = driver.lastName;
    }
}