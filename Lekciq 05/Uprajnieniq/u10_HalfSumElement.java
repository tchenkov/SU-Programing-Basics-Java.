package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u10_HalfSumElement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numCount = Integer.parseInt(scan.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sumAllNumbers = 0;

        for (int i = 0; i < numCount; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            sumAllNumbers += currentNumber;
            if (currentNumber > maxNumber){
                maxNumber = currentNumber;
            }
        }

        if (maxNumber == sumAllNumbers - maxNumber){
            System.out.println("Yes Sum = " + maxNumber);
        }
        else {
            int absDifference = Math.abs(maxNumber - (sumAllNumbers - maxNumber));
            System.out.println("No Diff = " + absDifference);
        }
    }
}
