package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u07_LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberCount = Integer.parseInt(scan.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < numberCount; i++) {
            leftSum += Integer.parseInt(scan.nextLine());
        }
        for (int i = 0; i < numberCount; i++) {
            rightSum += Integer.parseInt(scan.nextLine());
        }

        if (leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum);
        }
        else{
            int sumDifference = Math.abs(leftSum - rightSum);
            System.out.println("No, diff = " + sumDifference);
        }
    }
}
