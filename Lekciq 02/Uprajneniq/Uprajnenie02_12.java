package Uprajneniq;

import java.util.Scanner;

public class Uprajnenie02_12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double cash = Double.parseDouble(scan.nextLine());
        String startingCurancy = scan.nextLine().toUpperCase();
        String convertToCurancy = scan.nextLine().toUpperCase();
        double cashConverted = Uprajnenie02_12.CashConverter(cash, startingCurancy, convertToCurancy);

        System.out.printf("%.2f %s", cashConverted, convertToCurancy);
    }

    public static double CashConverter(double cash, String startCurancy, String endCurancy) {

        double toUsd = 1.79549;
        double toEur = 1.95583;
        double toGbp = 2.53405;

        if (cash == 0) {
            return cash;
        } else {
            switch (startCurancy) {
                case "BGN":
                    break;
                case "USD":
                    cash = cash * toUsd;
                    break;
                case "EUR":
                    cash = cash * toEur;
                    break;
                case "GBP":
                    cash = cash * toGbp;
            }

            switch (endCurancy) {
                case "BGN":
                    break;
                case "USD":
                    cash = cash / toUsd;
                    break;
                case "EUR":
                    cash = cash / toEur;
                    break;
                case "GBP":
                    cash = cash / toGbp;
            }

            return cash;
        }
    }
}
