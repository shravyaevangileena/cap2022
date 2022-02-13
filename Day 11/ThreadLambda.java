package Day11;


public class ThreadLambda {
	   public static void main(String args[]) {
	      new Thread(() -> { 
	         for(int i=1; i <= 5; i++) {
	            System.out.println("A Thread prints: A"+ i);
	            try {
	               Thread.sleep(500);
	            } catch(Exception e) {
	               e.printStackTrace();
	            }
	         }
	      }).start();
	     
	      for(int j=1; j < 5; j++) {
	         System.out.println("B Thread Prints: B"+ j);
	         try {
	            Thread.sleep(500);
	         } catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	   }
	}
