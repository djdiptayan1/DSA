
//SHORT PROGRAM

/*
 *  In selection sort algorithm, we search for the lowest element and arrange it to the proper location. We swap the current element with the next lowest number.
 */

import java.util.Arrays;
public class sort2 {
    public static void main(String[] args) {
        int[] ar = { 1, 2, -8, 5, 9, 12, 0, 56, 4, 2 };
        selection(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void selection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
}
