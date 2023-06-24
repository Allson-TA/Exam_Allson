package Array;

import java.util.Arrays;

public class NumbersDemo {

	public static void main(String[] args) {
		//	創建一個整數數組 numbers，包含 5 個元素，分別為 10、20、30、40 和 50。編寫代碼打印數組中的所有元素。
		
		int numbers[] = {10,20,30,40,50};
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		for(int x : numbers){
			System.out.println(x);
		}
		
		Arrays.stream(numbers).forEach(System.out :: println);
		

	}

}
