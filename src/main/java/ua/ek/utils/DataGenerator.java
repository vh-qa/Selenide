package ua.ek.utils;

import ua.ek.model.User;

import java.util.Random;

public class DataGenerator {

    public static User getUser(){
        User user = new User();

        Random random = new Random();
        int randomIntNumber = random.nextInt();

        StringBuffer login = new StringBuffer();
        login.append("some_login_").append(randomIntNumber);

        StringBuffer email = new StringBuffer();
        email.append("some_email_").append(randomIntNumber).append("@company.com");

        user.setLogin(login.toString());
        user.setEmail(email.toString());

        StringBuffer password = new StringBuffer();
        password.append("some_password_").append(randomIntNumber);

        user.setPassword(password.toString());

        return user;
    }
}