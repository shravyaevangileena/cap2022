
class FirstThread extends Thread {

	Thread t;
	String ThreadName;
	FirstThread(String name) {
		ThreadName = name;
		System.out.println("Thread name" + name);
	}
	public void run() {
		try {
			for (int i = 8; i > 0; i--) {
			 System.out.println("Thread " + ThreadName + "," + i);
				Thread.sleep(7000);
			}
		} catch (InterruptedException e) {

			System.out.println("Thread " + ThreadName + " has been interrupted");
		}
	}
	public void start() {
		System.out.println("thread is starting" + ThreadName);
		if (t == null) {
			t = new Thread(this, ThreadName);
			t.start();
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {

		FirstThread t1 = new FirstThread("thread 1");
		t1.start();

		FirstThread t2 = new FirstThread("thread 2");
		t2.start();
	}
}
