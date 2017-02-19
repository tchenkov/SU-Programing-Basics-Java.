package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u08_OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberCount = Integer.parseInt(scan.nextLine());

        int oddPositionSum = 0;
        int evenPositionSum = 0;
        boolean isPositionEven = false;

        for (int i = 0; i < numberCount; i++, isPositionEven = !isPositionEven) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (isPositionEven){
                evenPositionSum += currentNumber;
            }
            else {
                oddPositionSum += currentNumber;
            }
        }

        if (oddPositionSum == evenPositionSum){
            System.out.println("Yes, sum = " + oddPositionSum);
        }
        else{
            int sumDifference = Math.abs(oddPositionSum - evenPositionSum);
            System.out.println("No, diff = " + sumDifference);
        }
    }
}
