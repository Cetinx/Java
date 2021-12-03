package Console;

import business.concretes.AutManager;
import dataAccess.concretes.inMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		AutManager manager = new AutManager(new inMemoryUserDao());
		
		User usera = new User(1,"Çetin","Yýlmaz","avc@gmail.com","1234567");
		
		
		
		User user0 = new User(1,"as","a","avc@gmail.com","45");
		
		manager.kayýtOl(usera);
		
		manager.kayýtOl(user0);
		
		

		
	}

}
