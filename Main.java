package ThreadPrg;
class Days extends Thread {
	 String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	public void Display() {
		SalesPersons Sp = new SalesPersons();
		Sp.start();


		for (String D : days) {
			System.out.println(D);
			try {
				sleep(800);
			} catch (InterruptedException m) {
				m.printStackTrace();
			}
			if(D=="Sunday"){
				System.out.println("Suspending");
				Sp.suspend();
				try {
					sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 


			if (D=="Wednesday") {
				System.out.println("Resuming");
				Sp.resume();
			}
		}
	}
}
class SalesPersons extends Thread {
	private String[] names = {"A", "B", "C", "D", "E"};


	public void Display() {		
		for (String N : names) {			
			System.out.println(N);
			try {
				sleep(500);
			} catch (InterruptedException m) {
				m.printStackTrace();
			}
		}
	}
}
public class Main {
	public static void main(String[] args) {				
		Days d = new Days();
		Thread q = new Thread(d);
		q.start();		
	}
}
