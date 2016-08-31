package com.example.user.fit.model.athlete;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Profile implements Serializable {
	private String email;
	private String password="";
	private String username;


	public Profile(String email, String password, String username) throws UnsecurePasswordException, InvalidEmailException, InvalidUsernameException {
		setEmail(email);
		setPassword(password);
		setUsername(username);
		System.out.println("ProfileActivity created!Hello "+username);
	}





	public void setEmail(String email) throws InvalidEmailException {

		if(!email.isEmpty()){
			Pattern pattern = Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}");
			Matcher matcher = pattern.matcher(email.toUpperCase());
	        if (matcher.matches()) {
			this.email = email;
	        	}else{
	        		throw new InvalidEmailException();
	        	}
			}


	}


	public void setPassword(String password) throws UnsecurePasswordException {
		if(validatePassword(password)){
			this.password=password;
		}else{
			throw new UnsecurePasswordException();
		}



	}
	public void setUsername(String username) throws InvalidUsernameException {
		if(!username.isEmpty()&&username.length()>=3)
		this.username = username;
		else throw new InvalidUsernameException();
	}


	/**
	 * clearAllFields should make all fields to empty but how
	 */
	public void clearAllFields(){

	}
	/**
	 * @return  if the password,entered earlier is the same as the newly entered
	 */
	public boolean comparePasswords(String s){
		if(!s.isEmpty()){
			if(s.equalsIgnoreCase(this.password)){
				return true;
			}
		}
		return false;
	}

	/**
	 * If the newly entered password is a secure password
	 * and is different from the old one,changes ProfileActivity's
	 * password.
	 * @param
	 * @throws UnsecurePasswordException
	 */
	public void changePassword(String s) throws UnsecurePasswordException{
		if(validatePassword(s)&&(!s.equals(password))){
			setPassword(s);
		}else{
			throw new UnsecurePasswordException();
		}
	}

	/**
	 *
	 * @param
	 * @return true if the password has more than 6 chars,one
	 * upper case and one lower case
	 */
	private boolean validatePassword(String s){
		if(!s.isEmpty()){
			boolean hasCapitalLetter = false;
			boolean hasSmallLetter = false;
			boolean hasNumber = false;
			if(s.length()>=6){
				for (int i = 0; i < s.length(); i++) {
					if(s.charAt(i)>=65&&s.charAt(i)<=90)
						hasCapitalLetter=true;
					if(s.charAt(i)>=97&&s.charAt(i)<=122)
						hasSmallLetter=true;
					if(s.charAt(i)>=48&&s.charAt(i)<=57)
						hasNumber = true;
				}
				if(hasCapitalLetter&&hasNumber&&hasSmallLetter)
					return true;
			}

		}
		return false;
	}

	public String getUsername() {
		return username;
	}

	//remove this
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	public Profile(String username, String password) throws InvalidUsernameException, UnsecurePasswordException {
		setUsername(username);
		setPassword(password);

	}
}
