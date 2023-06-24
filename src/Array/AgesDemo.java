package Array;

import java.util.Arrays;

public class AgesDemo {

	public static void main(String[] args) {
		// 5.創建一個整數數組 ages，包含 5 個元素，分別為 18、21、25、30 和 35。編寫代碼查找並打印數組中的最大值。

		int ages[] = {18,21,25,30,35};
		int max = ages[0]; // 假设第一个元素为最大值
		
		for(int i=0;i<ages.length;i++) {
			if(ages[i]>max) {
				max = ages[i];
			}
		}
		System.out.println(max);
		

		
	}

}
