package Manager;
import Interface.SatýsServices;
import Soyut.Game;
import Soyut.User;

public class SatýsManager implements SatýsServices {

	@Override
	public void buy(User user, Game game) {

		if(user.getBakiye() > game.getFiyat()) {
			System.out.println("Alýndý");
			user.setBakiye(user.getBakiye() - game.getFiyat());
			
			this.bakiyeShow(user);
			
		}else {
			System.out.println("baþarýsýz");
		}
		
		
	}

	@Override
	public void sell(User user, Game game) {
	user.setBakiye(user.getBakiye() + game.getFiyat());
		
		System.out.println("satýldý");
		
		this.bakiyeShow(user);
		
	}

	@Override
	public void bakiyeShow(User user) {
		System.out.println("Yeni Bakiye" + user.getBakiye());
		
	}
	


	

}
