interface Printable {
    void print();
}

class Circle implements Printable {
    public void print() {
        System.out.println("This is a Circle.");
    }
}

class Rectangle implements Printable {
    public void print() {
        System.out.println("This is a Rectangle.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable c = new Circle();
        Printable r = new Rectangle();
        c.print();
        r.print();
    }
}