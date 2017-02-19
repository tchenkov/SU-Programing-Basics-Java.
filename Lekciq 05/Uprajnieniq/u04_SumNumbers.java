package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u04_SumNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberCount = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < numberCount; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            sum += currentNumber;
        }

        System.out.println(sum);
    }
}
