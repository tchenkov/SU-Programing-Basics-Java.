package Uprajneniq;

import java.util.Scanner;
//p02_InchesToCentimeters
public class Uprajnenie02_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inches=");
        double inches = Double.parseDouble(scan.nextLine());
        double centimeters = inches * 2.54;

        System.out.println("Centimeters = " + centimeters);

    }
}