package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 15.02.2017 г..
 */
public class u03_SquareOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int squareSize = Integer.parseInt(scan.nextLine());
        String star = "* ";
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
