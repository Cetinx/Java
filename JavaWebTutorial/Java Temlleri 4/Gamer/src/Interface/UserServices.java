package Interface;
import Soyut.User;

public interface UserServices {

	void add(User user);
	
	void delete(User user);
	
	void update(User user, String FirstName , String lastName);
	
	void yazdýr(User user);
}
