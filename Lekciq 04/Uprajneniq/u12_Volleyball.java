package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u12_Volleyball {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String yearType = scan.nextLine().toLowerCase();
        int holidays = Integer.parseInt(scan.nextLine());
        int weekendsAtHome = Integer.parseInt(scan.nextLine());

        int weekends = 48;

        double activeInSofia = (weekends - weekendsAtHome) * 0.75;
        double activeAtHolidays = (holidays*2.0) / 3;
        double totalPlayedGames = activeInSofia + weekendsAtHome + activeAtHolidays;

        if (yearType.equals("normal")) {
            System.out.println((int)totalPlayedGames);
        }
        else if (yearType.equals("leap")) {
            totalPlayedGames *= 1.15;
            System.out.println((int)totalPlayedGames);
        }

    }
}
