package ThreadPrg;

public class ThreadQue1 {

	public static void main(String[] args) {
		Thread t1 = new Thread("Scooby");
		System.out.println(t1.getName());
		Thread t2 = new Thread("Shaggy");
		System.out.println(t2.getName());

	}
}
