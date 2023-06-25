//The input array must be continuous from 1 to N
import java.util.*;

public class sort1 {
    public static void main(String[] args) {
        int[] ar = { 3, 5, 2, 1, 4 };
        cycle(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}