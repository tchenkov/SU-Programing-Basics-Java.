package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u05_InvalidNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        boolean isNumValid = num == 0 || (100<= num && num <= 200);

        if (!isNumValid) {
            System.out.println("invalid");
        }
    }
}
