import java.util.*;

public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter elements");
            arr[i] = sc.nextInt();
        }

        System.out.println("SMALLEST ELEMENT : " + mini(arr));
    }

    static int mini(int ar[]){
        int min = ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min = ar[i];
            }
        }
        return min;
    }
}