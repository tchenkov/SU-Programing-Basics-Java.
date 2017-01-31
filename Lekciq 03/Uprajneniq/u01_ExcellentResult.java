package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 17.01.2017 г..
 *
 * Първата задача от тази тема е да се напише конзолна програма, която въвежда оценка (десетично число)
 * и отпечатва “Excellent!”, ако оценката е 5.50 или по-висока.
 *
 */
public class u01_ExcellentResult {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 5.5){
            System.out.println("Excellent!");
        }

    }
}
