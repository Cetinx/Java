package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	
	
private	int id;
private	String firstName;	
private String lastName;	
private String userMail;	
private String userPass;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String userMail, String userPass) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userMail = userMail;
		this.userPass = userPass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	
	
	
	

}
