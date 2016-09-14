package edu.kis.vh.stacks.impl;

public class StackArray implements StackImpl {

	private static final int LAST_INDEX = 11;
	private static final int CAPACITY = 12;

	private final int[] items = new int[CAPACITY];
	private int total = StackConstants.EMPTY;

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	@Override
	public boolean isEmpty() {
		return total == StackConstants.EMPTY;
	}

	@Override
	public boolean isFull() {
		return total == LAST_INDEX;
	}

	@Override
	public int top() {
		if (isEmpty())
			return StackConstants.EMPTY;
		return items[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return StackConstants.EMPTY;
		return items[total--];
	}
}
