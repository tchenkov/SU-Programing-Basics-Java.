package Uprajneniq;

import java.util.Scanner;

//Напишете програма, която чете от конзолата число r и пресмята и
// отпечатва лицето и периметъра на кръг / окръжност с радиус r.
public class Uprajnenie02_06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
