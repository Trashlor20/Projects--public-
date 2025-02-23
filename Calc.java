public class Calc {
    // Private data fields
    private double num1;
    private double num2;

    // Constructor
    public Calc(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getter methods
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Method to add the numbers
    public double add() {
        return num1 + num2;
    }

    // Method to subtract the numbers
    public double subtract() {
        return num1 - num2;
    }

    // Method to multiply the numbers
    public double multiply() {
        return num1 * num2;
    }

    // Method to divide the numbers
    public double divide() {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }
}