
public class Instructor extends User{
	
	private String branch ;
	
	
	public Instructor() {
		super();
		
	}

	public Instructor(String adi, String soyad, String tc, String mail , String branch) {
		super(adi, soyad, tc, mail);
		this.branch = branch;
		
	}
	
	

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}


	
	

}
