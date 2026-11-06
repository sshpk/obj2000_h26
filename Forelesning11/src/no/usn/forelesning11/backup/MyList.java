package no.usn.forelesning11.backup;

public interface MyList<E> {
	void add(E e);
    void addFirst(E e);
    E get(int index);
    int size();

}
