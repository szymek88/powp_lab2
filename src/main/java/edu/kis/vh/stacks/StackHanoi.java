package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impl.StackImpl;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi() {
		super();
	}

	public StackHanoi(StackImpl stackImpl) {
		super(stackImpl);
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
