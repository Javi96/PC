package parte2;

import java.util.ArrayList;

public class B extends Thread {

	public static final int M = 8000;
	public static final int K = 10;

	Number number;
	
	boolean flag;

	public B(Number number, boolean flag) {
		this.number = number;
		this.flag = flag;
	}

	@Override
	public void run() {
		if(flag){
			number.add();
		}
		else{
			number.sub();
		}

	}

	public static void main(String[] args) throws InterruptedException {
		for (int j = 0; j < K; j++) {
			Number number = new Number();
			ArrayList<Thread> threadList = new ArrayList<Thread>();
			for (int i = 0; i < M; i++) {
				threadList.add((new B(number, true)));
				threadList.get(i).start();
			}
			for (int i = 0; i < M; i++) {
				threadList.add((new B(number, false)));
				threadList.get(M+i).start();
			}
			for (Thread thread : threadList) {
				thread.join();
			}
			System.out.println("Execution value: " + number.toString());
		}

	}
}
