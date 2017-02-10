package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 24.01.2017 г..
 */
public class u15_Trip {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double spendingMoney = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        double tripCost = 0.0;
//
        if (spendingMoney > 0) {
            System.out.print("Somewhere in ");
            if (spendingMoney <= 100) {
                System.out.println("Bulgaria");
                if (season.equals("summer")) {
                    tripCost = spendingMoney * 0.3;
                    System.out.printf("Camp - %.2f", tripCost);
                }
                else if (season.equals("winter")) {
                    tripCost = spendingMoney * 0.7;
                    System.out.printf("Hotel - %.2f", tripCost);
                }
            }
            else if (spendingMoney > 1000) {
                tripCost = spendingMoney * 0.9;
                System.out.println("Europe");
                System.out.printf("Hotel - %.2f", tripCost);
            }
            else {
                System.out.println("Balkans");
                if (season.equals("summer")) {
                    tripCost = spendingMoney * 0.4;
                    System.out.printf("Camp - %.2f", tripCost);
                }
                else if (season.equals("winter")) {
                    tripCost = spendingMoney * 0.8;
                    System.out.printf("Hotel - %.2f", tripCost);
                }
            }
        }

    }
}
