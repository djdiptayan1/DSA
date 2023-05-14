import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGHT OF ARRAY");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("ENTER ELEMENT");
            arr[i]=sc.nextInt();
        }
        System.out.println("ARRAY IS"+ Arrays.toString(arr));
    }
}