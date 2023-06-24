package Array;

import java.util.Arrays;

public class LettersDemo {

	public static void main(String[] args) {
		// 創建一個字符數組 letters，包含 6 個元素，分別為 'a'、'b'、'c'、'd'、'e' 和 'f'。編寫代碼使用 for-each 循環打印數組中的所有元素。
		String letters[] = {"a","b","c","d","e","f"};
		
		for(int i=0;i<letters.length;i++) {
			System.out.println(letters[i]);
		}
		
		for(String x : letters) {
			System.out.println(x);
		}
		
		Arrays.stream(letters).forEach(System.out::println);
	}

}
