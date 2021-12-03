import java.rmi.RemoteException;

import mernis.KPSPublicSoap;
import mernis.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		
try {
	return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth());
} catch (Exception e) {
	
	e.printStackTrace();
	return false;

}
	}

	
}
