package ThreadPrg;

import java.util.Random;

public class ColorQue implements Runnable {

	public static void main(String[] args) {
		ColorQue c=new ColorQue();
		Thread t=new Thread(c);
		t.start();
		
	}
	public void run() {
		Random random=new Random();
		String array[]= {"white","blue","black","green","red","yellow"};
		int i;
		while((i=random.nextInt(6))!=4) {
			System.out.println(array[i]);
		}
	}

}
