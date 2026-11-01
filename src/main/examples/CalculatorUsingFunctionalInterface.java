package main.examples;

public class CalculatorUsingFunctionalInterface {
public static void main(String[] args) {
	  // 2. Implement the interface using Lambda Expressions
    Calculator addition = (a, b) -> a + b;
    Calculator subtraction = (a, b) -> a - b;
    Calculator multiplication = (a, b) -> a * b;
    Calculator division = (a, b) -> {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    };

    // 3. Execute the operations
    System.out.println("Addition (10 + 5): " + addition.calculate(10, 5));
    System.out.println("Subtraction (10 - 5): " + subtraction.calculate(10, 5));
    System.out.println("Multiplication (10 * 5): " + multiplication.calculate(10, 5));
    System.out.println("Division (10 / 5): " + division.calculate(10, 5));
   
    
  }
}
