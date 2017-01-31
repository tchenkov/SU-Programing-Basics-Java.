package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 17.01.2017 г..
 *
 * Следващата задача от тази тема е да се напише конзолна програма, която въвежда оценка (десетично число)
 * и отпечатва “Excellent!”, ако оценката е 5.50 или по-висока, или “Not excellent.” в противен случай.
 *
 */
public class u02_ExcellentOrNot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 5.5) {
            System.out.println("Excellent!");
        }
        else {
            System.out.println("Not excellent.");
        }

    }
}
