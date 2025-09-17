import java.util.Scanner;

public class DoWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print("Enter a number (0 to exit): ");
            input = sc.nextInt();
            System.out.println("You entered: " + input);
        } while (input != 0);

        System.out.println("Program exited.");
        sc.close();
    }
}
