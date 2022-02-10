package LambdaPrgs;

import java.util.function.BiFunction;


class AddDemo {

	public static int add(int a, int b) {

		return a + b;
	}
}

public class MethodStaticReference {

	public static void main(String ar[]) {

		BiFunction<Integer, Integer, Integer> adder = AddDemo::add;// using method reference

		int result = adder.apply(5, 5);

		System.out.println(result);

	}

}