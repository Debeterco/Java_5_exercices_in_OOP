package application;

import entities.Sensor;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Data of the sensor: ");
        System.out.print("Sensor name: ");
        String sensorName = scan.nextLine();
        System.out.print("Value of the sensor: ");
        Double sensorValue = scan.nextDouble();
        Sensor sensor = new Sensor(sensorName, sensorValue);

        System.out.println();
        System.out.println("Sensor data: ");
        sensor.showSensor();

        scan.close();
    }
}
