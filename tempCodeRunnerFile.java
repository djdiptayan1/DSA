public class SwapTest {

    public static void swap(Object x, Object y){
        Object t = x;
        x = y;
        y = t;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Sumit", 99.9);
        Double p2 = new Double(66.6);
        System.out.println(p1.name + "\t" + p1.marks);
        System.out.println(p2);
        swap(p1, p2);
        System.out.println(p1.name + "\t" + p1.marks);
        System.out.println(p2);
    }
}

class Person {
    String name;
    double marks;

    public Person(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}
