package chapter10;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> numStack = new Stack<Integer>();
		numStack.push(10);
		numStack.push(20);
		numStack.push(30);
		System.out.println(numStack);
		numStack.pop();
		System.out.println(numStack);
		System.out.println(numStack.pop());
		numStack.add(30);
		System.out.println(numStack);
		System.out.println(numStack.peek());

	}

}
