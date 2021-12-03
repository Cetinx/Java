
public abstract class BaseCostomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
	
		System.out.println("EKlendi" + customer.getFirstName() + customer.getLastName());
		
	}
	
	

}
