package ThreadPrg;

public class EvenOdd {

	public static void main(String[] args) {
		Runnable r = new even();
		Thread t1 = new Thread(r);
		t1.start();
		Runnable r2 = new odd();
		Thread t2 = new Thread(r2);
		t2.start();
	}

}

class even implements Runnable {
	public void run() {
		for (int i = 2; i <=10; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
}

class odd implements Runnable {
	public void run() {
		for (int i = 1; i <=10; i++) {
			if (i % 2 == 1)
				System.out.println(i);
		}
	}
}