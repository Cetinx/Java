package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstarct.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class AutManager implements UserService {

	private UserDao userDao;
	
	
	
	public AutManager(UserDao userDao) {
		
		this.userDao = userDao;
	}

	@Override
	public void giris(User user) {
		
		System.out.println("G�ir� Deneme");

	}

	@Override
	public void kay�tOl(User user) {
		
	
		
		String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getUserMail());
       
        if(matcher.matches()) {
             System.out.println("Email Kay�t Olu�turuldu");
             
             
             
     		if( 6 < user.getUserPass().length()) {
    			
    			System.out.println("�ifre Olu�turuldu");
    			
    			
    			
    			
     		}else if(6 > user.getUserPass().length() ) {
    			
    			
    			System.out.println("en az 6 olucak ");
    		}
    	
    			
    			
    			
    		
             
         }else {
        	 System.out.println("Email Dogrulanmad�");
       
         
         }
		
		

		
	}

	
	
}
