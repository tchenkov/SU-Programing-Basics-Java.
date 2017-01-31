package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u03_PointInRectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean isInRectangle = (x1 <= x && x <= x2) && (y1 <= y && y <= y2);

        if (isInRectangle) {
            System.out.println("Inside");
        }
        else {
            System.out.println("Outside");
        }
    }
}
