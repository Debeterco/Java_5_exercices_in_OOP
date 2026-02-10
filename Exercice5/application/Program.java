package application;

import entities.ScaleConverter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite the value: ");
        double bruteValue = scan.nextDouble();

        ScaleConverter scaleConverter = new ScaleConverter(bruteValue);
        if (bruteValue > 1023 || bruteValue < 0) {
            System.out.println("ALERT: Invalid value! Digit between 0 to 1023.");
        }
        else {
            double result = scaleConverter.convertScale();
            System.out.printf("The value in a scale of 0-100%% is: %.2f%%", result);
        }
            
        scan.close();
    }
}
