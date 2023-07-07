public class BinarySearch {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,7};
        int target = 1;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    public static int binarysearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end) / 2; //this can cause overflow of int range

            int mid = start + (end - start) / 2; // this is better

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // element not found
    }
}