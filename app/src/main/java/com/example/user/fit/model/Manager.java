package com.example.user.fit.model;

import android.util.Log;

import com.example.user.fit.ProfileActivity;
import com.example.user.fit.model.athlete.InvalidUsernameException;
import com.example.user.fit.model.athlete.Profile;
import com.example.user.fit.model.athlete.UnsecurePasswordException;

import java.util.HashMap;

/**
 * Created by user on 31.8.2016 г..
 */
public class Manager {
   static HashMap<String,Profile> users = new HashMap<>();

    private static Manager ourInstance = new Manager();

    public static Manager getInstance() {
        if(ourInstance==null){
            ourInstance= new Manager();

        }

        return ourInstance;
    }
    public void registerUser(Profile u){
        if(!u.getEmail().toString().isEmpty()&&u.getEmail().toString()!=null){
            if(!(users.containsKey(u.getEmail().toString()))){
                users.put(u.getEmail().toString(), u);
            }

        }

    }
    //TODO validateLogin() is not working
//    public boolean validateLogin(String username,String password){
//        if(users.containsKey(username)){
//            Log.e("Manager","we have this username");
//            String userName=users.get(username).getUsername();
//            String pass=users.get(username).getPassword();
//            if(userName.equals(username)&&pass.equals(password)){
//                Log.e("Manager","successful login");
//                return true;
//            }
//        }
//        return false;
//    }

    private Manager() {

        users=new HashMap<>();
    }
}
