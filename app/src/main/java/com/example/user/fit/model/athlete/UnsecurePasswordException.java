package com.example.user.fit.model.athlete;

public class UnsecurePasswordException extends Exception {
	public UnsecurePasswordException(){
		super("Password is insecure");
	}
}
