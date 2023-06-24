package Array;

import java.util.Arrays;

public class FruitsDemo {

	public static void main(String[] args) {
		//	創建一個字符串數組 fruits，包含 4 個元素，分別為 "apple"、"banana"、"orange" 和 "grape"。編寫代碼使用 for 循環打印數組中的所有元素。
		String fruits[] = {"apple","banana","orange","grape"};
		
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		for(String x : fruits) {
			System.out.println(x);
		}
		
		Arrays.stream(fruits).forEach(System.out::println);
	}

}
