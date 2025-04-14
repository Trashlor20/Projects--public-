import java.io.*;
import java.util.*;

public class CSVProcessor {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            bw.write("Name,Pay Rate,Hours Worked,Weekly Pay\n"); // Adding column headings
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String name = values[0];
                double payRate = Double.parseDouble(values[1]);
                double hoursWorked = Double.parseDouble(values[2]);

                double weeklyPay = payRate * hoursWorked;
                if (hoursWorked > 40) {
                    weeklyPay += (hoursWorked - 40) * payRate * 0.5;
                }

                String formattedPay = String.format("$%.2f", weeklyPay);
                bw.write(name + "," + payRate + "," + hoursWorked + "," + formattedPay + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}