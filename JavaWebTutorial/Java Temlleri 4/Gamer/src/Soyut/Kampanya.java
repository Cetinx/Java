package Soyut;

public class Kampanya {

	private int id;
	private String name;
	private double oran;
	
	public Kampanya(int id, String name, double oran) {
		super();
		this.id = id;
		this.name = name;
		this.oran = oran;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getOran() {
		return oran;
	}

	public void setOran(double oran) {
		this.oran = oran;
	}

	@Override
	public String toString() {
		return "Kampanya [id=" + id + ", name=" + name + ", oran=" + oran + "]";
	}
	
	
	
	
}
