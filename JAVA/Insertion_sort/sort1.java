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

        for (int i = 0; i < arr.length - 1; i++) { // i runs upto N-2
            for (int j = i + 1; j > 0; j--) { //

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}