package application;

import entities.Tank;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Tank values: ");
        System.out.print("Digit the value of the tank: ");
        int tankLevel = scan.nextInt();

        Tank tank = new Tank(tankLevel);

        System.out.println();
        System.out.println("Report tank data: ");
        tank.tankSecurity();

        scan.close();
    }
}