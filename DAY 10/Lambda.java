package LambdaPrgs;

@FunctionalInterface
interface Addable {
    
	int add(int a, int ab);

}

public class Lambda {

	public static void main(String ar[]) {
		
		//calling lambda expression here only applicable when we use only functional interfaces
		Addable adddemo = (a,b)->(a+b);  //no return type
		
		System.out.println(adddemo.add(4, 5));
		
		
		
		Addable adddemo1 = (a,b) ->{   //with return type
			
		  return(a+b);
		
		};
		
		System.out.println(adddemo1.add(8, 8));

	}

}

