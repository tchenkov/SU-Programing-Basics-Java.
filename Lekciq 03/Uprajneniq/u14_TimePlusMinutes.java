package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 18.01.2017 г..
 *
 * Да се напише програма, която въвежда час и минути от 24-часово денонощие и изчислява колко ще е часът след 15 минути.
 * Резултатът да се отпечата във формат hh:mm. Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
 * Часовете се изписват с една или две цифри. Минутите се изписват винаги с по две цифри,
 * с водеща нула когато е необходимо.
 *
 */
public class u14_TimePlusMinutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int timePlusMinutes = (hours * 60) + minutes + 15;

        hours = timePlusMinutes / 60;

        if (hours>=24){
            hours = hours % 24;
        }
        minutes = timePlusMinutes % 60;

        System.out.printf("%d:%02d", hours, minutes);
    }
}
