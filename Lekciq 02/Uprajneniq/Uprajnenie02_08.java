package Uprajneniq;

import java.util.Scanner;

//Напишете програма, която чете от конзолата страна и височина на триъгълник и пресмята неговото лице.
// Използвайте формулата за лице на триъгълник: area = a * h / 2.
// Закръглете резултата до 2 знака след десетичната точка използвайки “%.2f“.
public class Uprajnenie02_08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double area = a * h / 2;

        System.out.printf("Area = %.2f", area);

    }
}
