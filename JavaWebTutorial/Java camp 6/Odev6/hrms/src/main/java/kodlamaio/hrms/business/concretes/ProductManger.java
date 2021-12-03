package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ProductService;
import kodlamaio.hrms.dataAcces.abstracts.ProductDao;
import kodlamaio.hrms.entities.concretes.Product;

@Service
public class ProductManger implements ProductService {

	private ProductDao productDao;
	
	@Autowired
	public ProductManger(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

}
