
class PThread implements Runnable {
	int n;
	PThread(int n){
		this.n=n;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		}
}
public class Threads {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		PThread t1= new PThread(25);
		Thread th1=new Thread(t1);
		th1.start();
		
		new Thread(new PThread(30)).start();
		
		
	}

}
