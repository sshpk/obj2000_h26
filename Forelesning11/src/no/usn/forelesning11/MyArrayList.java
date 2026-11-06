package no.usn.forelesning11;

public class MyArrayList <E> implements MyList<E>{
	private E[] data = (E[])new Object[4];
	private int size = 0;
	
	public void add(E e) {
		ensureCapacity();
		data[size] = e;
		size++;
	}
	
	public void addFirst(E e) {
		ensureCapacity();
		for(int i = size-1; i>=0; i--) {
			data[i+1] = data[i];
		}
		data[0] = e;
		size++;
	}
	
	public E get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index "+index+" størrelse "+ size );
		}		
		return data[index];
	}

	public int size() {
		return size;
	}
	private void ensureCapacity() {
		if(size == data.length) {
			E[] newData = (E[]) new Object[data.length*2];
			for(int i =0; i < size;i++) {
				newData[i] = data[i];
			}
		data = newData;
		}
		
	}
}
