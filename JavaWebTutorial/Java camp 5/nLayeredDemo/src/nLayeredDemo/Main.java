package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.concretes.JLoggerManagerAdaptrr;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;

import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		
		ProductService productService = new ProductManager(new AbcProductDao()
				,new JLoggerManagerAdaptrr());
		
		Product product = new Product(2,5,"pc",10.20,10);
		
		
		
		productService.add(product);
		
		
		
		
	}
	
}
