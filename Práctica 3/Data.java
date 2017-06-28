package part1.P3;

import java.util.Stack;

public class Data {

	Stack<Character> stack = new Stack<>();
	private char c;
	
	public synchronized char pop() {
		//System.out.println(" --- pop --- ");
		if (stack.empty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		c = stack.pop();
		notify();
		return c;
	}

	public synchronized void push(char c) {
		//System.out.println(" --- push --- ");
		if (!stack.empty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stack.push(c);
		notify();

	}

}
