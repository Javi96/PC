package part1.P3;

import java.util.Random;

public class Producer extends Thread{

	private Data stack;
	private String chain = "A1B2C3D4E5F6G7";
	private char c;
	private Random random = new Random();
	private int count, ms;

	public Producer(Data stack, int count, int ms) {
		this.stack = stack;
		this.count = count;
		this.ms = ms;

	}

	public Producer(Data stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			c = chain.charAt(random.nextInt(chain.length()));
			System.out.println("Producer " + i + ": " + c);
			stack.push(c);
			try {
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
