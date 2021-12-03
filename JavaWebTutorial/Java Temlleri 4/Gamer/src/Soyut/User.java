package Soyut;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private double bakiye;
	

	public User(int id, String firstName, String lastName , double bakiye) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bakiye = bakiye;
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

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", bakiye=" + bakiye + "]";
	}


	
	
	
	
		
}
