package ThreadPrg;

public class ThreadPriority implements Runnable{

	public static void main(String[] args) {

				ThreadPriority t = new ThreadPriority();
				
				Thread t1 = new Thread(t, "Thread1");
				Thread t2 = new Thread(t, "Thread2");
				Thread t3 = new Thread(t, "Thread3");
				
				t1.setPriority(Thread.MAX_PRIORITY);
				t2.setPriority(Thread.MIN_PRIORITY);
				t3.setPriority(Thread.NORM_PRIORITY);
				
				t1.start();
				t2.start();
				t3.start();
			}
			public void run() {
				for (int i = 0; i <= 10; i++)
					System.out.println(Thread.currentThread().getName() + ": " + i);		
			}

		}
