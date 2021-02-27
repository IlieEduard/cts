package clase;

public class ZooKepper {
	private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public ZooKepper(String nume) {
		super();
		this.nume = nume;
	}
	
	public void feed(Animal a) {
		System.out.println("Ingrijitorul "+this.nume+" hraneste pe "+a.getNume());
		
	}
	
}
