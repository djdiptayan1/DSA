class Person {
    String name;
    Double marks;

    Person(String name, Double marks) {
        this.name = name;
        this.marks = marks;
    }
}

class swaptest4 {
    public static void swap(Object x, Object y) {
        Object temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Raj", 90.0);
        Double p2 = new Double(90.0);
        System.out.println(p1+ " " + p2);
        swap(p1, p2);
        //System.out.println(p1 + " " + p2);
    }
}