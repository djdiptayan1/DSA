
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         *

public class pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }

    static void pattern4(int n) {

        for (int i = 1; i < 2 * n; i++) {
            int col = (i > n) ? 2 * n - i : i;

            int space = n - col;
            
            for (int s = 1; s <= space; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
