package oopIntro;

public class Product {
	
		String name ;
		String detail;
		int id;
   		double unitPrice;
   		
   		public Product() {
   			System.out.println("Paremetresiz Metot");
   			
   		}public Product(int id , String name , String detail , double unitPrice  ){
   			this(); // Bu Önemli
   			this.id = id;
   			this.name = name;
   			this.detail = detail;
   			this.unitPrice = unitPrice;
   			
   	}

	
	
	
}
