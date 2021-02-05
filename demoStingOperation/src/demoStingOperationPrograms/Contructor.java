package demoStingOperationPrograms;

public class Contructor {
	static String str;
public void Constructor() {
	System.out.println("in cons");
	str="Hello world";
}
	public static void main(String[] args) {
		Contructor c = new Contructor();
		System.out.println(str);
		
	}

}
