package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY = -1;
	
	private Node last;
	private int total = EMPTY;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		total++;
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		total--;
		return ret;
	}
	
	class Node {

		// W pozostalych klasach referencje do atrybutow zostaly zastapione getterami lub setterami w zaleznosci od potrzeby
		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
