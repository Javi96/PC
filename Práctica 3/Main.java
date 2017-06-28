package part1.P3;

public class Main {

	private final static int COUNT = 10;
	private final static int MS = 500;
	
	public static void main(String[] args) throws InterruptedException {

		Data stack = new Data();

		Producer pr = new Producer(stack, COUNT, MS);
		Consumer cs = new Consumer(stack, COUNT, MS*5);

		pr.start();
		cs.start();

		
		pr.join();
		cs.join();
	}
}
