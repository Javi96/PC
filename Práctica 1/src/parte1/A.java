package parte1;

import java.util.ArrayList;

public class A extends Thread {

	public static final int N = 80000000;

	@Override
	public void run() {
		System.out.println("Thread # " + Thread.currentThread().getId()
				+ " before sleep");
		try {
			sleep(0, 1);
			System.err.println("Thread # " + Thread.currentThread().getId()
					+ " after sleep");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Thread> threadList = new ArrayList<Thread>();
		for (int i = 0; i < N; i++) {
			threadList.add((new A()));
			threadList.get(i).start();
		}
		for (Thread thread : threadList) {
			thread.join();
		}

	}
}
