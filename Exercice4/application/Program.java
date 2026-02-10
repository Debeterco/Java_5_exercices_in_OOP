package application;

import entities.Values;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        List<Values> list = new ArrayList<>();
        int operatingCount = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digit '1' for operating or '0' for stopped: ");
            int listValues = scan.nextInt();

            Values value = new Values(listValues);
            list.add(value);

            if(value.operatingValues()) {
                operatingCount++;
            } 
        }

        System.out.printf("There are %d operating states", operatingCount);
        
        scan.close();
    }
}
