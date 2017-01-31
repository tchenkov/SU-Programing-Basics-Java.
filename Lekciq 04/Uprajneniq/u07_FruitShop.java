package Uprajneniq;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u07_FruitShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine().toLowerCase();
        String dayOfTheWeek = scan.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = -1;

        switch (dayOfTheWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                switch (product) {
                    case "banana":
                        price = 2.50;
                        break;
                    case "apple":
                        price = 1.20;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price = 1.45;
                        break;
                    case "kiwi":
                        price = 2.70;
                        break;
                    case "pineapple":
                        price = 5.50;
                        break;
                    case "grapes":
                        price = 3.85;
                }
                break;

            case "saturday":
            case "sunday":
                switch (product) {
                    case "banana":
                        price = 2.70;
                        break;
                    case "apple":
                        price = 1.25;
                        break;
                    case "orange":
                        price = 0.90;
                        break;
                    case "grapefruit":
                        price = 1.60;
                        break;
                    case "kiwi":
                        price = 3.00;
                        break;
                    case "pineapple":
                        price = 5.60;
                        break;
                    case "grapes":
                        price = 4.20;
                }
        }

        if (price > 0){
            double total = price * quantity;
            System.out.printf("%.2f", total);
        }
        else {
            System.out.println("error");
        }
    }
}
