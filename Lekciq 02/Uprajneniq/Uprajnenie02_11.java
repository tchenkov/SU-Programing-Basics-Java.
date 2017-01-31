package Uprajneniq;

import java.util.Scanner;

public class Uprajnenie02_11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double usd = Double.parseDouble(scan.nextLine());
        double bgn = usd * 1.79549;

        System.out.printf("bgn = %.2f", bgn);
    }
}
