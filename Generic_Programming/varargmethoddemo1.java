public class varargmethoddemo1 {
    static void varargmethoddemo1(int v[]) { //int v[] will pass everything as int
        System.out.println("Number of args : " + v.length + " Elements : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int x[] = { 1, 3, 5, 7 };
        int y[] = { 2, 4 };
        int z[] = {};
        varargmethoddemo1(x);
        varargmethoddemo1(y);
        varargmethoddemo1(z);
    }
}
