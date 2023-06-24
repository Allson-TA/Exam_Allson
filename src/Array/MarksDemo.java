package Array;

import java.util.Arrays;

public class MarksDemo {

	public static void main(String[] args) {
		//	4.創建一個整數數組 marks，包含 3 個元素，分別為 90、85 和 95。編寫代碼計算數組中所有元素的總和，並將結果打印出來。
		
		int marks[] = {90,85,95};
		int sum =0;
		for(int i=0;i<marks.length;i++) {
			sum += marks[i];
		}
		System.out.println(sum);
		
		sum = 0;
		for (int x : marks) {
		    sum += x;
		}
		System.out.println(sum);

		sum = Arrays.stream(marks).sum();
		System.out.println(sum);
	}

}
