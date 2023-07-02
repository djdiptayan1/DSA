
//The input array must be continuous from 1 to N
// UNDERSTANDING LEETCODE
import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] ar = { 3, 5, 2, 1, 4 };
        cycle(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // int correct = arr[i] - 1;
            if (arr[i] != i && arr[i] < arr.length) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}