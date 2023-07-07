
//The input array must be continuous from 1 to N
// UNDERSTANDING LEETCODE
import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] ar = { 3, 5, 2, 1, 4 };
        cycle(ar);
        System.out.println(Arrays.toString(ar));
    }

   // This code cycles through an array of integers, making sure that each number is in the correct location. It does this by looping through the array and swapping the current number with the number at its correct index. It continues looping through the array until all numbers are in the correct place. The numbers in the array must be between 0 and the length of the array.

public static void cycle(int[] arr) {
        // Loop over the array
        int i = 0;
        while (i < arr.length) {
            // If the number at the current index is not in the right place
            if (arr[i] != i && arr[i] < arr.length && arr[i] >= 0) {
                // Swap it with the number at its correct index
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            } else {
                // Otherwise, move to the next index
                i++;
            }
        }
    }
}