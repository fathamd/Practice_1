package Java8;

import java.util.function.BiConsumer;

public class ExceptionalHandelling {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int key = 0;
		addarray(arr, key,  wrapperLamda((v,k) -> System.out.println(v / k)));
	}

	private static void addarray(int[] arr, int key, BiConsumer<Integer, Integer> object) {
		for (Integer i : arr) {
			object.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> object) {
		return (v,k) -> {
			try {
				object.accept(v, k);
			}catch(Exception e) {
				System.out.println("Exception");
			}
		};
	}
}
