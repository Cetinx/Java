

public class Customer {

		private int id;
		private String firstName;
		private String lastName;
		private String nationalityId;
		private int dateOfBirth;
		
		
		
		public Customer(int id, String firstName, String lastName, String nationalityId, int dateOfBirth) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.nationalityId = nationalityId;
			this.dateOfBirth = dateOfBirth;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(int dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getNationalityId() {
			return nationalityId;
		}
		public void setNationalityId(String nationalityId) {
			this.nationalityId = nationalityId;
		}
		
	
}
