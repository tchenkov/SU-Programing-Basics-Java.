package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u06_MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberCount = Integer.parseInt(scan.nextLine());
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numberCount; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber < minNumber){
                minNumber = currentNumber;
            }
        }

        System.out.println(minNumber);
    }
}
