package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impl.StackImpl;
import edu.kis.vh.stacks.impl.StackList;

public class StackFIFO extends Stack {

	// StackList bedzie lepszym wyborem, poniewaz jest zaimplementowany przy uzyciu dynamicznej listy
	private final StackList temp = new StackList();

	public StackFIFO() {
		super();
	}

	public StackFIFO(StackImpl stackImpl) {
		super(stackImpl);
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());

		return ret;
	}
}
