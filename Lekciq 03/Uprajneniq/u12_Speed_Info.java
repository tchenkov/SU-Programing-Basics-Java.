package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 18.01.2017 г..
 *
 * Да се напише програма, която въвежда скорост (десетично число) и отпечатва информация за скоростта.
 * При скорост до 10 (включително) отпечатайте “slow”. При скорост над 10 и до 50 отпечатайте “average”.
 * При скорост над 50 и до 150 отпечатайте “fast”. При скорост над 150 и до 1000 отпечатайте “ultra fast”.
 * При по-висока скорост отпечатайте “extremely fast”.
 */
public class u12_Speed_Info {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double speed = Double.parseDouble(scan.nextLine());

        if (speed <= 10){
            System.out.println("slow");
        }
        else if (speed > 1000){
            System.out.println("extremely fast");
        }
        else if (speed > 150){
            System.out.println("ultra fast");
        }
        else if (speed > 50){
            System.out.println("fast");
        }
        else {
            System.out.println("average");
        }
    }
}
