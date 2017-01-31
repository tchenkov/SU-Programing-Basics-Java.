package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 17.01.2017 г..
 *
 * Да се напише програма, която въвежда цяло число и печата дали е четно или нечетно.
 *
 */
public class u03_EvenOrOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        boolean isEven = num % 2 == 0;

        if (isEven){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
