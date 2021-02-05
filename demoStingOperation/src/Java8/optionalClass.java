package Java8;

import java.util.Optional;

public class optionalClass {

	public static void main(String[] args) {
		String str = null;
		String s = Optional.ofNullable(str).orElse("1");
		System.out.println(s);

	}

}
