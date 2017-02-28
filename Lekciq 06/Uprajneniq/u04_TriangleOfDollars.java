package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 15.02.2017 г..
 */
public class u04_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int triangleSize = Integer.parseInt(scan.nextLine());
        String dollarSign = "$ ";
        for (int i = 0; i < triangleSize; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(dollarSign);
            }
            System.out.println();
        }
    }
}
