package no.usn.forelesning6_;

public class House {
	private Room kitchen;
	private Room bedroom;
	
	public House() {
		kitchen = new Room("Kitchen");
		bedroom = new Room("Bedroom");
	}
	
	public Room getKitchen() {
		return kitchen;
	}
	public Room getBedroom() {
		return bedroom;
	}
}
