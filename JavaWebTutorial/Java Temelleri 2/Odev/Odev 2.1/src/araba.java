
public class araba {
	
	private String marka;
	private String model;
	private String renk;
	
	araba(){
		System.out.println("Normal Yapýcý Blok");
	}
	araba(String marka,String model,String renk){
		
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		
		System.out.println(marka + " "+ model + " "+ renk);
	}

}
