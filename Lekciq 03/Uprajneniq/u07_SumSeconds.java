package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 17.01.2017 г..
 *
 * Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50). Да се напише програма,
 * която въвежда времената на състезателите и пресмята сумарното им време във формат "минути:секунди".
 * Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").
 *
 */
public class u07_SumSeconds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int time1 = Integer.parseInt(scan.nextLine());
        int time2 = Integer.parseInt(scan.nextLine());
        int time3 = Integer.parseInt(scan.nextLine());
        int timeSum = time1 + time2 + time3;

        int minutes = timeSum / 60;
        int seconds = timeSum % 60;

        System.out.printf("%d:%02d", minutes, seconds);

    }
}
