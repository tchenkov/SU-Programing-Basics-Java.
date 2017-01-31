package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u08_TradeComissions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine().toLowerCase();
        double sales = Double.parseDouble(scan.nextLine());

        double comission = 0;

        switch (city) {
            case "sofia":
                if (0 <= sales && sales <= 500) {
                    comission = 0.05;
                }
                else if (500 < sales && sales <= 1000) {
                    comission = 0.07;
                }
                else if (1000 <= sales && sales <= 10000) {
                    comission = 0.08;
                }
                else if (10000 < sales) {
                    comission = 0.12;
                }
                break;
            case "varna":
                if (0 <= sales && sales <= 500) {
                    comission = 0.045;
                }
                else if (500 < sales && sales <= 1000) {
                    comission = 0.075;
                }
                else if (1000 <= sales && sales <= 10000) {
                    comission = 0.10;
                }
                else if (10000 < sales) {
                    comission = 0.13;
                }
                break;
            case "plovdiv":
                if (0 <= sales && sales <= 500) {
                    comission = 0.055;
                }
                else if (500 < sales && sales <= 1000) {
                    comission = 0.08;
                }
                else if (1000 <= sales && sales <= 10000) {
                    comission = 0.12;
                }
                else if (10000 < sales) {
                    comission = 0.145;
                }
                break;
            default:
                System.out.println("error");
                return;
        }

        if (sales >= 0) {
            comission *= sales;
            System.out.printf("%.2f", comission);
        }
        else {
            System.out.println("error");
        }
    }
}
