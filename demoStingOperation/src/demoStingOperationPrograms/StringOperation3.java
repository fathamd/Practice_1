package demoStingOperationPrograms;

///How to reverse String in Java using Iteration and Recursion?
public class StringOperation3 {

	public static void main(String[] args) {
		String str = "welcome";
		char []ch1 = str.toCharArray();
		String str2 =new String();
		StringBuilder str3 = new StringBuilder();
		for(int i = ch1.length-1; i>=0;i--) {
			str2 = str2 + ch1[i];
			str3.append(ch1[i]);
		}
		System.out.println("reversed String1:" + str2);
		System.out.println("reversed String2:" + str3);
	}

}
