
// Note: 2D ArrayList
import java.util.*;

public class multilist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("ENTER :");
            for (int j = 0; j < 3; j++) {
                int x = sc.nextInt();
                list.get(i).add(x);
            }
        }
        System.out.println(list);
    }
}
