package demoStingOperationPrograms;

//convert_String_To_Number
public class StringOperation5 {

	public static void main(String[] args) {
		String str= "12345aaac";
		char ch[]=str.toCharArray();
		int zero = (int)'0';
		int sum = 0;
		for(Character c: ch) {
			int tempch = (int)c;
			sum = (sum*10)+(tempch-zero);
		}
		System.out.println("output  integer:"+ sum);
	}

}
