package Advanced;

public class MyThread extends Thread{
	private Monitor m;
	private Boolean cond;
	
	public MyThread(Monitor m, Boolean cond){
		this.m=m;
		this.cond=cond;
	}
	
	public void run(){
		if(cond){
			//m.pick(1 + (int)(Math.random()%4));
			m.pick(2);
		}else {
			m.insert(2);
			//m.insert(1 + (int)(Math.random()%4));
		}
		//m.resume();
	}

}
