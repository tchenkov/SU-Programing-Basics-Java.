package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 18.01.2017 г..
 *
 * Да се въведат 3 числа и да се отпечата дали са еднакви (yes / no)
 *
 */
public class u15_ThreeEqualNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        if ((num1 == num2) && (num2 == num3)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
