package com.example.user.fit.model.athlete;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Profile implements Serializable {
	private String email="";
	private String password="";
	private String username;


	public Profile(String email, String password, String username) {
		this.email=email;
		this.password=password;
		this.username=username;

	}



	public String getUsername() {
		return username;
	}

	//remove this
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	public Profile(String username, String password) {
		this.username=username;
		this.password=password;
	}
}
