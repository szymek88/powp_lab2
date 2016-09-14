package edu.kis.vh.stacks;

public class Stack {

	private static final int LAST_INDEX = 11;

	private static final int EMPTY_STACK_INDEX = -1;

	private static final int DEFAULT_VALUE = -1;

	private static final int CAPACITY = 12;

	private final int[] items = new int[CAPACITY];

	private int total = EMPTY_STACK_INDEX;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_INDEX;
	}

	public boolean isFull() {
		return total == LAST_INDEX;
	}

	public int top() {
		if (isEmpty())
			return DEFAULT_VALUE;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return DEFAULT_VALUE;
		return items[total--];
	}

}
