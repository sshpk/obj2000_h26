package no.usn.forelesning6_;

public class TestHouse {

	public static void main(String[] args) {
		House house = new House();
		
		Room r = house.getKitchen();
		System.out.println(r.getName());

	}

}
