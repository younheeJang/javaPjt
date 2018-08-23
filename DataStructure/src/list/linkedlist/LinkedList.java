package list.linkedlist;

import java.util.Arrays;

public class LinkedList {

	private Node head;
	private Node tail;

	private int size = 0;
	private String[] values;

	private class Node {

		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	void addFirst(Object data) {
		Node addedNode = new Node(data);
		addedNode.next = head;
		head = addedNode;
		size++;
		if (addedNode == null) {
			tail = head;
		}
	}

	void addLast(Object data) {
		Node addedNode = new Node(data);
		if(size==0) {
			addFirst(data);
		}else {
			tail.next=addedNode;
			tail=addedNode;
			size++;
		}
	}

	public Node getNode(int position) {
		Node positionNode = head;
		for (int i = 0; i < position; i++) {
			positionNode = positionNode.next;
		}
		return positionNode;
	}

	void add(int position, Object data) {
		if (position == 0) {
			addFirst(data);
			return;
		}
		Node addedNode = new Node(data);
		Node temp1 = getNode(position - 1);
		Node temp2 = temp1.next;
		temp1.next = addedNode;
		addedNode.next = temp2;
		size++;
		if (addedNode.next == null) {
			tail = addedNode;
		}
	}

	public Object get(int position) {
		return getNode(position).data;
	}

	public Object removeFirst() {
		Object data = head.data;
		head = head.next;
		size--;
		return data;
	}

	public Object remove(int position) {

		if (position == 0) {
			return removeFirst();
		}

		Object removedData;
		Node removeNode = getNode(position);
		removedData = removeNode.data;

		Node temp1 = getNode(position - 1);

		temp1.next = temp1.next.next;
		size--;

		if (removeNode == tail) {
			tail = temp1;
		}
		return removedData;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		String result = "";
		result += "[";
		for (int i = 0; i < size; i++) {
			/*
			 * if(i==(size-1)) { result+=get(i).toString();
			 * 
			 * }else { result+=get(i).toString()+","; }
			 */
			// int ij= (1 == 1) ? 2 :3;
			result += (i == (size - 1)) ? get(i).toString() : get(i).toString() + ",";

		}
		result += "]";
		return result;
	}

	/*
	 * public ListIterator listIterator() { return new ListIterator(); }
	 * 
	 * public class ListIterator { private int nextIndex; private Node lastReturned;
	 * private Node next;
	 * 
	 * public boolean hasNext() { return nextIndex < size(); }
	 * 
	 * public ListIterator() { nextIndex = 0; next = head; }
	 * 
	 * public Object next() { lastReturned = next; next = next.next; nextIndex++;
	 * return lastReturned.data; }
	 * 
	 * }
	 */
	public Iterator dataIterator() {

		return new Iterator();
	}

	public class Iterator {

		private int dataIndex;
		private Node next;
		private Node lastReturned;

		public Object next() {
			lastReturned = next;
			next = next.next;
			dataIndex++;
			return lastReturned.data;
		}

		public Iterator() {
			next = head;
			dataIndex = 0;
		}

		public boolean hasNext() {
			return dataIndex < size();
		}

		public void add(Object data) {
			if (dataIndex == 0) {
				addFirst(data);
			} else {
				Node addedNode = new Node(data);
				lastReturned.next = addedNode;
				addedNode.next = next;
				size++;
			}
			dataIndex++;
		}

		public void remove() {
			if (dataIndex == 0) {
				throw new IllegalStateException();
			} else {
				LinkedList.this.remove(dataIndex - 1);
				dataIndex--;
			}
		}
	}
}
