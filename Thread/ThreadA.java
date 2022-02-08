class A extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(this.getThreadGroup());
		System.out.println(this.getState());
		for(int i=0;i<this.getStackTrace().length;i++) {
			System.out.println(this.getStackTrace()[i]);
		}
	}
}
public class ThreadA {

	public static void main(String[] args) {
		A a=new A();
		a.start();
		System.out.println();
		
	}

}
