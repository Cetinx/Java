package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ProductService;
import kodlamaio.hrms.entities.concretes.Product;

@RestController
@RequestMapping("/api/pro")
public class Products {

	private ProductService ProductService;

	@Autowired
	public Products(kodlamaio.hrms.business.abstracts.ProductService productService) {
		super();
		ProductService = productService;
	}

	@GetMapping("/getall")

	public List<Product> getAll() {

		return this.ProductService.getAll();
	}

}
