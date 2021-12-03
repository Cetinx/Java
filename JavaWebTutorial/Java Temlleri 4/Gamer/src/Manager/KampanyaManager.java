package Manager;
import Interface.KampanyaServices;
import Soyut.Game;
import Soyut.Kampanya;

public class KampanyaManager implements KampanyaServices {

	@Override
	public void add(Kampanya kampanya) {
		System.out.println("Eklendi " + kampanya.getName());
		
	}

	@Override
	public void delete(Kampanya kampanya) {
		System.out.println("Silindi " + kampanya.getName());
		
	}

	@Override
	public void update(Kampanya kampanya, String name, double oran) {
		System.out.println("Güncellendi " + kampanya.getName());
		kampanya.setName(name);
		kampanya.setOran(oran);
		
	}

	@Override
	public void yazdýr(Kampanya kampanya) {
		System.out.println(kampanya);
		
	}




	
	@Override
	public void enjectAll(Game[] games , Kampanya kampanya) {
		
		
		
		for (Game game : games) {
			
			System.out.println("Eski fiyat : " + game.getFiyat());
			
			game.setFiyat(game.getFiyat() - game.getFiyat() * kampanya.getOran() / 100 );
			 
			 System.out.println(game);
		}
		
		
	}
	
	
	
}
