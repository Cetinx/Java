package Manager;
import Soyut.User;


public class UserManager  implements Interface.UserServices {

	@Override
	public void add(User user) {
		System.out.println("Eklendi " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Silindi " + user.getFirstName());
		
	}

	@Override
	public void update(User user, String FirstName, String lastName) {
	System.out.println("G�ncellendi " + user.getFirstName());
		
		user.setFirstName(FirstName);
		user.setlastName(lastName);
		
	}

	@Override
	public void yazd�r(User user) {
		System.out.println(user);
		
	}

}
