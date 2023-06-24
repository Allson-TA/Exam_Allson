package Array;

import java.util.Arrays;

public class NamesDemo {

    public static void main(String[] args) {
        // 創建一個字符串數組 names，包含 5 個元素，分別為 "John"、"Alice"、"Bob"、"Emily" 和 "David"。編寫代碼找到具有最長長度的字符串，並將其打印出來。

        String names[] = {"John", "Alice", "Bob", "Emily", "David"};
        String max = names[0]; // 假設第一元素為最大值

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > max.length()) {
                max = names[i];
            }
        }
        System.out.println(max);

        for (String x : names) {
            if (x.length() > max.length()) {
                max = x;
            }
        }
        System.out.println(max);

    }
}
