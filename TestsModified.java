import java.text.DecimalFormat;
import java.util.Scanner;

public class Tests {
    private double sum;
    private int count;
    private double average;

    // Constructor
    public Tests() {
        this.sum = 0.0;
        this.count = 0;
        this.average = 0.0;
    }

    // Method to get average of test scores
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double score;

        System.out.println("Enter test scores (press -1 to quit): ");
        score = scanner.nextDouble();

        while (score != -1) {
            sum += score;
            count++;
            System.out.println("Enter test scores (press -1 to quit): ");
            score = scanner.nextDouble();
        }

        if (count > 0) {
            average = sum / count;
        } else {
            average = Double.NaN;
        }

        scanner.close();
    }

    // toString method
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "The average of the " + count + " scores entered is: " + df.format(average);
    }

    // Main method for testing
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.getAverage();
        System.out.println(tests);
    }
}