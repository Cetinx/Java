
public class Market {

	private String marka;
	private String renk;
	
	Market(){
		System.out.println("contructor Çalýþtý");
	
	}
	Market(String marka,String renk){
	this.marka = marka;	
	this.renk = renk;	
		System.out.println(marka + " " + renk);
	}
}
