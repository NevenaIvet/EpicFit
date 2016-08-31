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
            Log.e("Manager","created new manager");
        }
        Log.e("Manager","manager exists");
        return ourInstance;
    }
    public void registerUser(String username, String password){
        Profile p = null;
        try {
            p = new Profile(username, password);
        } catch (InvalidUsernameException e) {
            e.printStackTrace();
        } catch (UnsecurePasswordException e) {
            e.printStackTrace();
        }

       // if(!users.containsKey(p.getUsername())){
         users.put(p.getUsername(),p);
     //}
    }
    public boolean validateLogin(String username,String password){
        if(users.containsKey(username)){
            Log.e("Manager","we have this username");
            String userName=users.get(username).getUsername();
            String pass=users.get(username).getPassword();
            if(userName.equals(username)&&pass.equals(password)){
                Log.e("Manager","successful login");
                return true;
            }
        }
        return false;
    }

    private Manager() {
        users=new HashMap<>();
    }
}
