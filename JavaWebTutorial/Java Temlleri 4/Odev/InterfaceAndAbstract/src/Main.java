
public class Main {

		public static void main(String[] args) {
			
			
	BaseCostomerManager baseCostomerManager = new SturbucksCustomerManager(new MernisServiceAdapter());
			
		Customer cetin = new Customer(1,"�etin","Y�lmaz","13",2004);
		
		baseCostomerManager.save(cetin);
		
		}
}
