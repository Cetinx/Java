
import Manager.KampanyaManager;
import Manager.UserManager;
import Soyut.Game;
import Soyut.Kampanya;
import Soyut.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		
		KampanyaManager kampanyaManager = new KampanyaManager();
		
		
		Kampanya kampanya = new Kampanya(1,"kara cuma",15);
		
		Game[] games = {new Game (1,"GTA",100) , new Game(2,"LA",200)};
		
		
		User cetin = new User(1,"Çetin","Y",1000);
		
		userManager.add(cetin);
		
		kampanyaManager.enjectAll(games, kampanya);
		
		
		
		
		

	}

}
