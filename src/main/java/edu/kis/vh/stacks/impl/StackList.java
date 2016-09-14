package edu.kis.vh.stacks.impl;

public class StackList implements StackImpl {

	private Node last;
	private int total = StackConstants.EMPTY;

	@Override
	public int getTotal() {
		return total;
	}

	@Override
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

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return StackConstants.EMPTY;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return StackConstants.EMPTY;
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
