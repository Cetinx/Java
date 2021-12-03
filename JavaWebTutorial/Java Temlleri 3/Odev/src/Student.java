
public class Student  extends User{

	private int studentNumber ;
	

	public Student(String adi, String soyad ,String tc , String mail,int studentNumber) {
		super(adi,soyad,tc,mail);
		this.studentNumber = studentNumber;
	}
	

	
	public Student() {
		
		
		
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}


	
	
}
