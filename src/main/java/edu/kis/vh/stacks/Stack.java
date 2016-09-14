package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impl.StackImpl;
import edu.kis.vh.stacks.impl.StackList;

public class Stack {

	// klasa jest teraz bardziej uniwersalna, poniewaz nie jest przywiazana do jednego typu
	private StackImpl stackImpl;

	public Stack(StackImpl stackImpl) {
		this.stackImpl = stackImpl;
	}

	public Stack() {
		stackImpl = new StackList();
	}

	public int getTotal() {
		return stackImpl.getTotal();
	}

	public void push(int i) {
		stackImpl.push(i);
	}

	public boolean isEmpty() {
		return stackImpl.isEmpty();
	}

	public boolean isFull() {
		return stackImpl.isFull();
	}

	public int top() {
		return stackImpl.top();
	}

	public int pop() {
		return stackImpl.pop();
	}
	
}
