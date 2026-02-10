package application;

import entities.Production;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        Production production;

        double average = 0;
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digit the %d value: ", i);
            int productionValue = scan.nextInt();
            production = new Production(productionValue);
            sum = production.sumOfProduction(sum);
            average = production.averageOfProduction(sum, average);
        }

        System.out.println();
        System.out.println("SUM: "+ sum);
        System.out.println("AVERAGE: " + average);
        
        scan.close();
    }
}
