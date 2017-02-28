package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 15.02.2017 г..
 */
public class u02_RectangleOfNStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rectangleSize = Integer.parseInt(scan.nextLine());
        char star = '*';
        for (int i = 0; i < rectangleSize; i++) {
            for (int j = 0; j < rectangleSize; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
