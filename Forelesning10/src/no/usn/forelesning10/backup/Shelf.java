package no.usn.forelesning10.backup;
import java.util.ArrayList;

public class Shelf<T> {
	private ArrayList<T> elements = new ArrayList<>();
	
	public void add(T item) {
		elements.add(item);
	}
	public T get(int index) {
		return elements.get(index);
	}
	
	public int size() {
		return elements.size();
	}
}
