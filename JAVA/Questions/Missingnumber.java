/**
 * Given an array 'nums' containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 * Follow up: Could vou implement a solution using only 0 (1) extra space
 * complexity and O(n)
 * runtime complexity?
 * 
 * Example 1:
 * Input: nums = [3, 0, 1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in
 * the range [0,3]. 2 is the missing number in the range since it does not
 * appear in nums.
 */
public class Missingnumber {
    public static int missingnumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != i) {
                //
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        // Search for missing element
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] ar = { 4, 0, 2, 1 };
        System.out.println(missingnumber(ar));
    }
}
