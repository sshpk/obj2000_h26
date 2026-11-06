package no.usn.forelesning11;

public interface MyList<E> {
	void add(E e);
	void addFirst(E e);
	E get(int index);
	int size();
}
