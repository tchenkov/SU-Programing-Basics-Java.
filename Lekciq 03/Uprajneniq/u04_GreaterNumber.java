package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 17.01.2017 г..
 *
 * Да се напише програма, която въвежда две цели числа и отпечатва по-голямото от двете.
 *
 */
public class u04_GreaterNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        if (num1 > num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
