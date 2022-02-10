package LambdaPrgs;

@FunctionalInterface
interface Drawables{
	
	public void  draw();
	
}


public class Lambdaexpression {
		
	public static void main(String ar[]) {
		
		int width = 5;
		//functional style
		Drawables d =() ->{
			
			System.out.println("draw "+width);
		};
		d.draw();
	}
}

