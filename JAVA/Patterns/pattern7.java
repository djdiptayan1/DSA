//     1 
//    212 
//   32123 
//  4321234 
// 543212345 


public class pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {

            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
