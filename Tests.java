import java.text.DecimalFormat;

public class Tests {
    public static void main(String[] args) {
        // Declare variables for test scores
        double testScore1 = 88.2;
        double testScore2 = 78.9;
        double testScore3 = 97.6;

        // Calculate the average of the test scores
        double average = (testScore1 + testScore2 + testScore3) / 3;

        // Format the average to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        // Display the test scores and their average
        System.out.println("Test score 1: " + testScore1);
        System.out.println("Test score 2: " + testScore2);
        System.out.println("Test score 3: " + testScore3);
        System.out.println("The average of 3 test scores is: " + df.format(average));
    }
}