package part1.P3;

public class Consumer extends Thread {

	private Data stack;
	private int count, ms;

	public Consumer(Data pila, int count, int ms) {
		this.stack = pila;
		this.count = count;
		this.ms = ms;

	}

	@Override
	public void run() {
		char c;
		for (int i = 0; i < count; i++) {
			c = stack.pop();
			System.out.println("Consumer " + i + ": " + c);
			try {
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
