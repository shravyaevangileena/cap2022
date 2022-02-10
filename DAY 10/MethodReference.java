package LambdaPrgs;

@FunctionalInterface
interface Messagable {

	void getMessage(String msg);

}

class Message {

	void Show(String msg) {

		System.out.println("From method");
		System.out.println("--> " + msg);// using method here
	}

}


public class MethodReference {

	public static void main(String[] args) {

		Message m = new Message();// creating object

		// interface
		Messagable reference = m::Show; // reference of interface here

		// calling here

		reference.getMessage("Hi");

	}

}
