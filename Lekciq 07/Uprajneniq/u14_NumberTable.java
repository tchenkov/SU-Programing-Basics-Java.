package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 21.02.2017 г..
 */
public class u14_NumberTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numSquareSize = Integer.parseInt(scan.nextLine());
        
        for (int i = 1; i <= numSquareSize; i++) {
            for (int j = 0; j < numSquareSize; j++) {
                int currentNumber = i + j;
                if (currentNumber > numSquareSize){
                    currentNumber = 2*numSquareSize - currentNumber;
                }
                System.out.printf("%d ", currentNumber);
            }
            System.out.println();
        }
    }
}