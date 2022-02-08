package ThreadPrg;

public class Print extends Thread{

	public static void main(String[] args) {
		Thread t1=new Thread();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==5) {
				try {
					t1.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	
}
