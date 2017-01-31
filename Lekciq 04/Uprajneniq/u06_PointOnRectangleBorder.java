package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u06_PointOnRectangleBorder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean isOnLeftBorder = x == x1 && (y1 <= y && y <= y2);
        boolean isOnRightBorder = x == x2 && (y1 <= y && y <= y2);
        boolean isOnTopBorder = y == y1 && (x1 <= x && x <= x2);
        boolean isOnBottomBorder = y == y2 && (x1 <= x && x <= x2);

        boolean isOnAnyBorder = isOnLeftBorder || isOnRightBorder || isOnTopBorder || isOnBottomBorder;

        if (isOnAnyBorder) {
            System.out.println("Border");
        }
        else {
            System.out.println("Inside / Outside");
        }
    }
}
