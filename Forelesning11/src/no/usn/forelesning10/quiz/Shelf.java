package no.usn.forelesning10.quiz;

import java.util.ArrayList;

public class Shelf<T> {
	private ArrayList<T> items = new ArrayList<>();

    public void add(T item) { items.add(item); }
    public T get(int index) { return items.get(index); }
    public int size() { return items.size(); }
}
