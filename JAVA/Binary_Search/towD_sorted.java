
/**SEARCH IN A SORTED MATRIX

   | 1 | 2 | 3 | 4 |
   | 5 | 6 | 7 | 8 |
   |9 |10 |11 |12 |
   | 13 |14 |15 |16|
   **/

import java.util.*;

class twoD_sorted {
   public static void main(String[] args) {

   }
//search in the row provided between the cols provided
   static int[] binarysearch(int[][] matrix, int row, int cstart, int cend, int target) {
      while (cstart <= cend) {
         int mid = cstart + (cend - cstart) / 2;
         if (matrix[row][mid] == target) {
            return new int[] { row, mid };
         }
         if (matrix[row][mid] < target) {
            cstart = mid + 1;
         } else {
            cend = mid - 1;
         }
      }
   }

   static int[] search(int[][] matrix, int target) {
      int row = matrix.length;
      int col = matrix[0].length;
      if(row ==1){
         return binarysearch(matrix, 0, 0, col-1, target);
      }
   }

}