class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class AdvancedMath extends MathOperation {
    @Override
    int add(int a, int b) {
        System.out.println("Overridden method called");
        return a + b + 10;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println("Sum (int): " + mo.add(5, 10));
        System.out.println("Sum (double): " + mo.add(5.5, 3.2));

        AdvancedMath am = new AdvancedMath();
        System.out.println("Overridden Sum: " + am.add(5, 10));
    }
}