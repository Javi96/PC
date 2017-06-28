package Advanced;

public class Main {
	public static void main(String[] args){
		MyThread[] t=new MyThread[20];
		Monitor m=new Monitor(10);
		
		
		for(int i=0; i<20; i++){
			t[i]=new MyThread(m,i%2==0);
		}
		
		for(int i=0; i<20; i++){
			t[i].start();
		}
		
		for(int i=0; i<20; i++){
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		m.showTotal();
	}
}
