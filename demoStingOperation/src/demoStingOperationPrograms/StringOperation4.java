package demoStingOperationPrograms;

public class StringOperation4 {
// How to check if a String contains only digits?

	public static void main(String[] args) {
		String str = "12387980";
		boolean flag = false;
		for(int i = 0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println("It doesnt have all integer");
		}
		else {
			System.out.println("Sting has only integer");
		}
	}

}
