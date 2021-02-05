package Java8;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		//Thread t = new Thread(()-> printMessage()); // when no argument in lamda and not passing anything
		// its just executing method in lamda expression
		Thread t = new Thread(MethodReferenceExample1::printMessage);
		t.start();
	}
	public static void printMessage() {
		System.out.println("Hello");
	}

}
