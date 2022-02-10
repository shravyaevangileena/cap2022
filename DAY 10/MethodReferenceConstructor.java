package LambdaPrgs;

@FunctionalInterface
interface Messagable1 {

	void getMessage(String msg);

}

class Message1 {
	// creating constructor here
	Message1(String msg) {

		System.out.println("From constructor");
		System.out.println("---> " + msg);// using method here
	}

}

public class MethodReferenceConstructor {

	public static void main(String[] args) {

		// interface
		Messagable1 reference = Message1::new; // using constructor here

		// calling here

		reference.getMessage("Hi");

	}
}

