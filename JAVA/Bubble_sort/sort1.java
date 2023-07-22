import java.util.Arrays;

public class sort1 {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 5, 9, 12, 0, 156, 4, 2 };
        bubble(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                // swap the elements
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

}
