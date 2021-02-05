package demoStingOperationPrograms;
// to check if given string is anagram
public class StringOperation2 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "bcd";
		boolean flag = false;
		if(str1.length() != str2.length()) {
			flag = false;
		}else {
			for(int i = 0; i<str1.length();i++) {
				for(int j=0;j< str2.length();j++) {
					if(str1.charAt(i)== str2.charAt(j)) {
						flag = true;
						break;
					}else {
						flag = false;
					}
				}
			}
		}
		if(flag) {
			System.out.println("given Strings are Anagram");
		}else {
			System.out.println("Given String are not Anagram");
		}

	}

}
