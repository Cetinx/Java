package Manager;
import Interface.Sat�sServices;
import Soyut.Game;
import Soyut.User;

public class Sat�sManager implements Sat�sServices {

	@Override
	public void buy(User user, Game game) {

		if(user.getBakiye() > game.getFiyat()) {
			System.out.println("Al�nd�");
			user.setBakiye(user.getBakiye() - game.getFiyat());
			
			this.bakiyeShow(user);
			
		}else {
			System.out.println("ba�ar�s�z");
		}
		
		
	}

	@Override
	public void sell(User user, Game game) {
	user.setBakiye(user.getBakiye() + game.getFiyat());
		
		System.out.println("sat�ld�");
		
		this.bakiyeShow(user);
		
	}

	@Override
	public void bakiyeShow(User user) {
		System.out.println("Yeni Bakiye" + user.getBakiye());
		
	}
	


	

}
