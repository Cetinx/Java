
public class Main {

	public static void main(String[] args) {
	
	
		UserManager userManager = new UserManager();
		
		User user0 = new User("Ahmet0","y�ld�r","120","gmail.com");
		
		User user1 = new User("Ahmet2","y�ld�r","120","gmail.com");
		
		User user2 = new User("Ahmet","y�ld�r","120","gmail.com");
	
		userManager.yazdir(user0);
		
		userManager.yazdir(user1);
		
		userManager.yazdir(user2);
		
		System.out.println(" ");
		
		Student student1 = new Student("Ahmet","y�ld�r","120","gmail.com",5);
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.show(student1);
		
		System.out.println("");
		
		InstructorManager instructorManager = new InstructorManager();
		
		Instructor instructor = new Instructor("Egin","Demiro�","10","outlook","Python");
		
		instructorManager.kursEkle(instructor);
		
		
		

		
		
		
		

	}

	
}
