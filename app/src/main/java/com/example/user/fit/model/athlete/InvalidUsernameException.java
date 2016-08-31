package com.example.user.fit.model.athlete;

public class InvalidUsernameException extends Exception {
	public InvalidUsernameException(){
		super("Username is not valid");
	}
}
