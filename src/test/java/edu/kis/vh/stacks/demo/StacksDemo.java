package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStackFactory;
import edu.kis.vh.stacks.factory.StackArrayFactory;
import edu.kis.vh.stacks.factory.StackFactory;
import edu.kis.vh.stacks.factory.StackListFactory;

class StacksDemo {

	// wiersze 19-27 byly zle sformatowane
	// alt + strzalka zmienia zakladke na poprzednia/nastepna
	public static void main(String[] args) {
		StackFactory defaultStackFactory = new DefaultStackFactory();
		testStacks(defaultStackFactory);
		
		StackFactory stackListfactory = new StackListFactory();
		testStacks(stackListfactory);
		
		StackFactory stackArrayFactory = new StackArrayFactory();
		testStacks(stackArrayFactory);
	}

	private static void testStacks(StackFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

}