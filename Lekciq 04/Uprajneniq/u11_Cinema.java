package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u11_Cinema {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String projectionType = scan.nextLine().toLowerCase();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        double ticketCount = rows * columns;
        double total = 0;

        switch (projectionType) {
            case "premiere":
                total = ticketCount * 12;
                break;
            case "normal":
                total = ticketCount * 7.5;
                break;
            case "discount":
                total = ticketCount * 5;
        }

        System.out.printf("%.2f", total);
    }
}
