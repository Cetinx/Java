package Interface;

import Soyut.Game;
import Soyut.Kampanya;

public interface KampanyaServices {

	void add(Kampanya kampanya);
	
	void delete(Kampanya kampanya);
	
	void update(Kampanya kampanya , String name , double oran);
	
	void yazd�r(Kampanya kampanya);
	
	public void enjectAll(Game[] games , Kampanya kampanya);
	
	
	
}
