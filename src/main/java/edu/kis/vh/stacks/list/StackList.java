package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY = -1;
	private Node last;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
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
