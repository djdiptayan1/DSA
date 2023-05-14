// 1. Write a program to create an ArrayList, add some colors (string) and print out the collection.
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int index = 0; index < 10; index++) {
            System.out.println("ENTER :");
            int x = sc.nextInt();
            list.add(x);
        }
        System.out.println(list);
        System.out.println(list.contains(9999));
        System.out.println(list.remove(list));
    }
}
