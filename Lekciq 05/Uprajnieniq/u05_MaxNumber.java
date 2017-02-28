package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u05_MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberCount = Integer.parseInt(scan.nextLine());
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numberCount; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber > maxNumber){
                maxNumber = currentNumber;
            }
        }

        System.out.println(maxNumber);
    }
}
