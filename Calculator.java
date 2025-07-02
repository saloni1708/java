public class Calculator {

    // Method to add two numbers
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

    // Main method to test the Calculator class
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Example operations
        calc.add(10, 5);
        calc.subtract(10, 5);
        calc.multiply(10, 5);
        calc.division(10, 5);
    }
}