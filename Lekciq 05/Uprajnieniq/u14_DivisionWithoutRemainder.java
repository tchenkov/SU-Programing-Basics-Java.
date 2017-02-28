package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u14_DivisionWithoutRemainder {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int numberCount = Integer.parseInt(scan.nextLine());
        
        double noRemainderBy2Count = 0;
        double noRemainderBy3Count = 0;
        double noRemainderBy4Count = 0;
              
        for (int i = 0; i < numberCount; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber % 2 == 0){
                noRemainderBy2Count++;
            }
            if (currentNumber % 3 == 0){
                noRemainderBy3Count++;
            }
            if (currentNumber % 4 == 0){
                noRemainderBy4Count++;
            }
                        
        }
        
        double numPercentBelow200 = noRemainderBy2Count / numberCount * 100.0;
        double numPercent200to399 = noRemainderBy3Count / numberCount * 100.0;
        double numPercent400to599 = noRemainderBy4Count / numberCount * 100.0;
        
        System.out.printf("%.2f%%\n", numPercentBelow200);
        System.out.printf("%.2f%%\n", numPercent200to399);
        System.out.printf("%.2f%%", numPercent400to599);
    }
}
