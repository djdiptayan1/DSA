class democlass {
    // defining a generic method to print any data type
    <T> void genericPrint(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        democlass obj = new democlass(); //create an object
        obj.genericPrint(101); //calling generic method
        obj.genericPrint("Joy with java");
        obj.genericPrint(3.1412343);
    }
}