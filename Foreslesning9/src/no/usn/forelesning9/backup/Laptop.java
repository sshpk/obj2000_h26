package no.usn.forelesning9.backup;

public class Laptop implements Borrowable{
	private String serialNumber;
    private boolean available = true;

    
	public Laptop(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public void checkOut() {
		available = false;
	}
	
	public void returnItem() {
		available = true;
	}

}
