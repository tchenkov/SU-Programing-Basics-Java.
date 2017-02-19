package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u12_EqualPairs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberCount = Integer.parseInt(scan.nextLine());
        int maxPairSumDifference = 0;
        int lastPairSum = 0;
        int currentPairSum = 0;
        int sumDifference = 0;

        for (int i = 0; i < numberCount; i++) {
            for (int j = 0; j < 2; j++) {
                int currentNumber = Integer.parseInt(scan.nextLine());
                currentPairSum += currentNumber;
            }

            if (i > 0){
                sumDifference = Math.abs(currentPairSum - lastPairSum);
                maxPairSumDifference = Math.max(maxPairSumDifference, sumDifference);
            }

            lastPairSum = currentPairSum;
            currentPairSum = 0;
        }

        boolean areSumEqual = maxPairSumDifference == 0;

        if (areSumEqual){
            System.out.println("Yes, value=" + lastPairSum);
        }
        else {
            System.out.println("No, maxdiff=" + maxPairSumDifference);
        }
    }
}
