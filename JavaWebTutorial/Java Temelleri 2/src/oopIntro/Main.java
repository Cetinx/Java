package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product veriBir = new Product(1,"Mac os","M1 i�lemci",20000);
		veriBir.id = 1;
		veriBir.name = "Mac os";
		veriBir.unitPrice = 20000;
		veriBir.detail = "M1 ��elmci";
		
		Product veri�ki = new Product();
		veri�ki.id = 2;
		veri�ki.name = "Linux";
		veri�ki.unitPrice = 5000;
		veri�ki.detail = "M1 ��elmci";
		
		Product veri�� = new Product();
		veri��.id = 3;
		veri��.name = "Windows";
		veri��.unitPrice = 10000;
		veri��.detail = "M1 ��elmci";
		
		
		Category birMenu = new Category();
		
		
		
		
		Product[] Products = {veriBir,veri�ki,veri��};
		
		for(Product Products0 : Products) {
			
			System.out.println(Products0.name);
		}
		
		System.out.println(Products.length+"\n ////////////////////////////////////////////////////");
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(veriBir);
	
		productManager.addToCart(veri�ki);
		
		productManager.addToCart(veri��);
		

	}

}
