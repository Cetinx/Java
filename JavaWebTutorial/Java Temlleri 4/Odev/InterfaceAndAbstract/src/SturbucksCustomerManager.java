
public class SturbucksCustomerManager extends BaseCostomerManager{


		
		private CustomerCheckService customerCheckService;
		
		public SturbucksCustomerManager(CustomerCheckService customerCheckService) {
			this.customerCheckService = customerCheckService;

		}
	@Override
	public void save(Customer customer) {
		
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
		}else {
			System.out.println("yanlýþ");
		}
		
	}

	
}
