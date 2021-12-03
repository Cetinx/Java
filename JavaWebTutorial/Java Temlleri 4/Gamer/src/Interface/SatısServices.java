package Interface;

import Soyut.Game;
import Soyut.User;

public interface SatýsServices {
	
	void buy(User user , Game game);
	
	void sell(User user , Game game);
	
	void bakiyeShow(User user );

}
