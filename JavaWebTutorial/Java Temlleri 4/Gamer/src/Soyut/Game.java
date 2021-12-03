package Soyut;

public class Game {

	private int id;
	private String name;
	private double fiyat;
	
	public Game(int id, String name, double fiyat) {
		super();
		this.id = id;
		this.name = name;
		this.fiyat = fiyat;
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

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Game id=" + id + ", name= " + name + ", fiyat=" + fiyat ;
	}
	
	
	
	
}
