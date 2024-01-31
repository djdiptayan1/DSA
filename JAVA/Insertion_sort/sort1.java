//INSERTION SORT
/*
 * Insertion Sort algorithm uses the technique of selecting a key in each iteration starting from the second element. Next, we make the proper position available for the key by shifting all the greater elements before it toward their right for sorting in ascending order. Finally, the selected key is stored before the last shifted greater element.
 */

import java.util.*;

public class sort1 {
    public static void main(String[] args) {
        int[] ar = { 5, 3, 4, 1, 2 };
        insertion(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // insert the key
        }
    }
}