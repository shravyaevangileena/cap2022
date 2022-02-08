
class SecondThread implements Runnable{
	Thread t;   
	String ThreadName;
	
	SecondThread(String name){
		ThreadName= name;
		System.out.println("creating thread name : "+name);
	}
	
	public void run() {
		try {
			for(int i=8;i>0;i--) {
				System.out.println("creating thread name : "+ThreadName+","+i);
			    Thread.sleep(7000); 
			}
		}catch(InterruptedException e) {
			System.out.println("Thread "+ThreadName+" has been interrupted");
		}
	}
	
	public void start() { 
		System.out.println("Thread is starting...."+ThreadName);
		if(t==null) {
			t=new Thread(this,ThreadName); 
			t.start();
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		SecondThread t1 = new SecondThread("thread 1");
		t1.start();
		SecondThread t2 = new SecondThread("thread 2");
		t2.start();
	}
}