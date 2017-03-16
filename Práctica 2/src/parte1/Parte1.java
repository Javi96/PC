package parte1;

public class Parte1 extends Thread {

	private volatile int n;
	private volatile int last = 1;
	static boolean turn1 = false;
	static boolean turn2 = false;
	private static final int N = 3;

	class ThreadAdd extends Thread {

		public void run() {
			for (int i = 0; i < N; i++) {
				while (last == 1)
					;
				n++;
				last = 1;
			}
		}
	}

	class ThreadSub extends Thread {

		public void run() {
			for (int i = 0; i < N; i++) {
				while (last == 2)
					;
				n--;
				last = 2;
			}
		}
	}
}