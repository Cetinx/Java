
public class User {




	private String adi;
	private String soyad;
	private String tc;
	private String mail;
	
	
	
	public User() {

		
	}
	
	public User(String adi, String soyad, String tc, String mail) {

		this.adi = adi;
		this.soyad = soyad;
		this.tc = tc;
		this.mail = mail;
		
	}
	
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


	

	
	
	
	


}
