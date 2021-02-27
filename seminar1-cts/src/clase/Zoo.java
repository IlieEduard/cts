package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private ZooKepper zookeper;
	private List<Animal> lista;
	public Zoo(ZooKepper zookeper, List<Animal> lista) {
		super();
		this.zookeper = zookeper;
		this.lista = lista;
	}

	public Zoo() {
		super();
		this.zookeper=new ZooKepper("Gigel");
		lista= new ArrayList();
	}
	public void addAnimal(Animal a) {
		lista.add(a);
	}
	public void	feedAnimals()
	{
		for(Animal a:lista) {
			zookeper.feed(a);
		}
	}
}
