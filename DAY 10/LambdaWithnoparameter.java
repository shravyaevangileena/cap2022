package LambdaPrgs;
@FunctionalInterface
interface Sayable{
	
	public String  say();
	
}


public class LambdaWithnoparameter {
		
	public static void main(String ar[]) {
		
		//functional style
		Sayable s =() ->{
			return "hello"; 
		};
		System.out.println(s.say());
	}
}

