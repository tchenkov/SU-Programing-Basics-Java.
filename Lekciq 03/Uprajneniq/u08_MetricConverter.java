package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 17.01.2017 г..
 * <p>
 * <p>
 * Да се напише програма, която преобразува разстояние между следните 8 мерни единици: m, mm, cm, mi, in, km, ft, yd.
 * Използвайте съответствията от таблицата по-долу:
 * входна единица	изходна единица
 * 1 meter (m)	1000 millimeters (mm)
 * 1 meter (m)	100 centimeters (cm)
 * 1 meter (m)	0.000621371192 miles (mi)
 * 1 meter (m)	39.3700787 inches (in)
 * 1 meter (m)	0.001 kilometers (km)
 * 1 meter (m)	3.2808399 feet (ft)
 * 1 meter (m)	1.0936133 yards (yd)
 * Входните данни се състоят от три реда:
 * •	Първи ред: число за преобразуване
 * •	Втори ред: входна мерна единица
 * •	Трети ред: изходна мерна единица (за резултата)
 */
public class u08_MetricConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        String startingMetricUnits = scan.nextLine().toLowerCase();
        String convertToMetricUnits = scan.nextLine().toLowerCase();
        double lengthConverted = 0;

        if (length == 0) {
            lengthConverted = length;
        } else {
            switch (startingMetricUnits) {
                case "m":
                    break;
                case "mm":
                    length = length / 1000;
                    break;
                case "cm":
                    length = length / 100;
                    break;
                case "mi":
                    length = length / 0.000621371192;
                    break;
                case "in":
                    length = length / 39.3700787;
                    break;
                case "km":
                    length = length / 0.001;
                    break;
                case "ft":
                    length = length / 3.2808399;
                    break;
                case "yd":
                    length = length / 1.0936133;
            }

            switch (convertToMetricUnits) {
                case "m":
                    lengthConverted = length;
                    break;
                case "mm":
                    lengthConverted = length * 1000;
                    break;
                case "cm":
                    lengthConverted = length * 100;
                    break;
                case "mi":
                    lengthConverted = length * 0.000621371192;
                    break;
                case "in":
                    lengthConverted = length * 39.3700787;
                    break;
                case "km":
                    lengthConverted = length * 0.001;
                    break;
                case "ft":
                    lengthConverted = length * 3.2808399;
                    break;
                case "yd":
                    lengthConverted = length * 1.0936133;
            }
        }


        System.out.printf("%f %s", lengthConverted, convertToMetricUnits);
    }
}
