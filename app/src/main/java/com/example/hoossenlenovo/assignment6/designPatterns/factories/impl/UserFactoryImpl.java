package com.example.hoossenlenovo.assignment6.designPatterns.factories.impl;

import com.example.hoossenlenovo.assignment6.designPatterns.domain.User;
import com.example.hoossenlenovo.assignment6.designPatterns.factories.UserFactory;
import com.example.hoossenlenovo.assignment6.domain.UserName;

import java.util.UUID;

/**
 * Created by Toshiba on 2016/04/07.
 */
public class UserFactoryImpl implements UserFactory{

    private static UserFactoryImpl factory = null;

    private  UserFactoryImpl() {
    }
    public static UserFactoryImpl getInstance(){
        if(factory ==null)
            factory = new UserFactoryImpl();
        return factory;
    }

    public User createUser(String id, int age, UserName uName) {
        User  user = new User
                .Builder()
<<<<<<< HEAD
                .userId(UUID.randomUUID().toString())
=======
                .id(UUID.randomUUID().toString())
>>>>>>> 18bfb1b06a979e4bb45b2817432811f956a8b05d
                .age(age)
                .uName(uName)
                .build();
        return user;
    }


}
