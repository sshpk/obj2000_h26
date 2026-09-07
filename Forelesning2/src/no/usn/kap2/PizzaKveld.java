package no.usn.kap2;

public class PizzaKveld {

	public static void main(String[] args) {

		int friends = 5;
		int slicePerPerson = 3;
		int totalSlices = friends * slicePerPerson;
		System.out.println("totalSlices = "+totalSlices);
		
		int juicePerPerson = 2;
		int totalJuice = friends * juicePerPerson;
		System.out.println("totalJuice = "+totalJuice);
		
		int slicesPerPizza = 8;
		//int pizzas = totalSlices/slicesPerPizza;
		double pizzas = (double)totalSlices/slicesPerPizza;
		System.out.println("pizzas = "+pizzas);
		
		int leftOver = 2 * slicesPerPizza % totalSlices;
		System.out.println("leftOver = "+leftOver);

	}

}
