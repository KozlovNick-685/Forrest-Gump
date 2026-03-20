public class MyLinkedList<T> implements MyList<T> {

	private Node<T> head;
	private int size;


	@Override
	public void add(T item) {
		if (head == null) {
			head = new Node<>(item);
		} else {
			Node<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = new Node<>(item);
		}
		size++;
	}

	@Override
	public void add(int index, T item) {

	}

	@Override
	public T get(int index) {
		if (index > size || index < 0) {
			throw new ArrayIndexOutOfBoundsException("АААА");
		}
		int counter = 0;
		Node<T> node = head;
		while(counter < index) {
			node = node.next;
			counter++;
		}
		return node.data;
	}

	@Override
	public T remove(int index) {

	}

	@Override
	public boolean remove(T item) {

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean contains(T item) {

	}

	@Override
	public int indexOf(T item) {

	}
}