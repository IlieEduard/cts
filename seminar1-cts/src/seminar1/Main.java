package seminar1;

import clase.Animal;
import clase.Leu;
import clase.Strutz;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo=new Zoo();
		Animal leu1=new Leu("Leutzu");
		Animal leu2=new Leu("Leutza");
		zoo.addAnimal(leu1);
		zoo.addAnimal(leu2);
		zoo.feedAnimals();
		
		Strutz strutz=new Strutz("Strutzu");
		Strutz strutz1=new Strutz("Strutza","grauntze");
		zoo.addAnimal(strutz);
		zoo.addAnimal(strutz1);
	}

}
