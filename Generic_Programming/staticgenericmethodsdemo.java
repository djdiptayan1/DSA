public class staticgenericmethodsdemo {
    static <T> void genericPrint(T t) {
        // the following statement print which type of parameter T this method is
        // handling
        System.out.println(t.getClass().getName() + ":" + t);
    }

    public static void main(String[] args) {
        genericPrint(101);
        genericPrint("Joy with java");
        genericPrint(3.1412343);
    }
}