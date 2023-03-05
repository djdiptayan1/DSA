public class swaptest {
    public static <T> void swap(T x, T y) {
        T t;
        t = x;
        x = y;
        y = t;
        System.out.println("X = "+x+"\tY = "+y);
    }

    public static void main(String[] args) {
        Integer x = new Integer(1);
        Integer y = new Integer(2);
        System.out.println("x = " + x + " y = " + y);
        swap(x, y);
        //System.out.println("x = " + x + " y = " + y);
    }
}