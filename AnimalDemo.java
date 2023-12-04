package Abstract;

public class AnimalDemo {
	public static void main(String[] args) {


	       // Create an array of Animal objects

	       Animal[] animals = new Animal[4];


		//add two Bird() objects to animals and two Fish objects to animals. 

	         //COMPLETE HERE
	       Bird bird1 = new Bird();
	       Bird bird2 = new Bird();
	       animals[0] = bird1;
	       animals[1] = bird2;
	       
	       Fish fish1 = new Fish();
	       Fish fish2 = new Fish();
	       animals[2] = fish1;
	       animals[3] = fish2;



	       // Iterate over the array and call move method

	       for (Animal animal : animals) {

	           animal.move();

	       }

	   }

}
