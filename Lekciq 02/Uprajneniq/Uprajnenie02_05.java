package Uprajneniq;

import java.util.Scanner;

//p05_TrapezoidArea
public class Uprajnenie02_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double trArea = (a + b) * h / 2;

        System.out.println("Trapezoid area = " + trArea);

    }
}
