import java.util.Arrays;
import java.util.Scanner;

 class Logic {
	
    public void solution(int[] arr) {
        int smallestInt = 1;

        if (arr.length == 0)
        	System.out.println( smallestInt);

        Arrays.sort(arr);

        if (arr[0] > 1) 
        	System.out.println( smallestInt);
        if (arr[arr.length - 1] <= 0)
        	System.out.println( smallestInt);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestInt) {
                smallestInt++;
            }
        }

        System.out.println( smallestInt);
    }
}

public class SmallestInt{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter size");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array");
		for(int i=0; i<n; i++)  
		{    
		a[i]=sc.nextInt();  
		}  
		 
	Logic l=new Logic();
	l.solution(a);
	sc.close();
	}
	}
