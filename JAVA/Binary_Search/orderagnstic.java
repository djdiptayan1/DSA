import java.util.*;
public class orderagnstic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 7 };
        System.out.println("ENTER THE NUMBER TO BE SEARCHED");
        int target = sc.nextInt();
        int ans = order(arr, target);
        System.out.println(ans);
    }

    public static int order(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc;
        if (arr[start] < arr[end])
            isAsc = true;
        else
            isAsc = false;

        while (start <= end) {
            // int mid = (start + end) / 2; //this can cause overflow of int range

            int mid = start + (end - start) / 2; // this is better

            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1; // element not found
    }
}