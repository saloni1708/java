import java.util.Scanner ;

public class Calculator2{

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    // Method to subtract two numbers
    public void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    // Method to multiply two numbers
    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    // Method to divide two numbers
    public void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = sc.nextInt();
        System.out.println("Enter second value ");
        int b = sc.nextInt();

        Calculator2 calc = new Calculator2();

        // Example operations
        calc.add(a , b);
        calc.subtract(a , b);
        calc.multiply(a , b);
        calc.division(a, b);

    }
}

