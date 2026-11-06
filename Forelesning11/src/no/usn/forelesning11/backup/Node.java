package no.usn.forelesning11.backup;

public class Node<E> {
	E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
    }
}
