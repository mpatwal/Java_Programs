import java.util.Scanner;

// Define the Calculator class
class Calculator {
    // Instance variables
    double num1;
    double num2;

    // Method to accept values from the user
    public void acceptValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
    }

    // Method to perform addition
    public double add() {
        return num1 + num2;
    }

    // Method to perform subtraction
    public double subtract() {
        return num1 - num2;
    }

    // Method to perform multiplication
    public double multiply() {
        return num1 * num2;
    }

    // Method to perform division
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN for invalid division
        }
    }

    // Method to perform modulus operation
    public double modulus() {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Error: Modulus by zero is not allowed.");
            return Double.NaN; // Return NaN for invalid modulus
        }
    }
}

public class qn16 {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calc = new Calculator();

        // Accept values from the user
        calc.acceptValues();

        // Perform and display all arithmetic operations
        System.out.println("\nResults of Arithmetic Operations:");
        System.out.println("Addition (num1 + num2): " + calc.add());
        System.out.println("Subtraction (num1 - num2): " + calc.subtract());
        System.out.println("Multiplication (num1 * num2): " + calc.multiply());
        System.out.println("Division (num1 / num2): " + calc.divide());
        System.out.println("Modulus (num1 % num2): " + calc.modulus());
    }
}
