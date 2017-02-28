package Uprajnieniq;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u11_OddEvenPosition {
    public static void main(String[] args) {
        
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("#.####");
        
        String[] strings = {"OddSum=", "OddMin=", "OddMax=", "EvenSum=", "EvenMin=", "EvenMax="};
        String[] oddEvenPositionValues = new String[6];
        
        Scanner scan = new Scanner(System.in);
        
        int numCount = Integer.parseInt(scan.nextLine());
        
        double oddPositionSum = 0;
        double oddPositionMinValue = Integer.MAX_VALUE;
        double oddPositionMaxValue = Integer.MIN_VALUE;
        boolean isThereOddPositions = false;
        
        double evenPositionSum = 0;
        double evenPositionMinValue = Integer.MAX_VALUE;
        double evenPositionMaxValue = Integer.MIN_VALUE;
        boolean isThereEvenPositions = false;
        
        boolean isPositionOdd = true;
        for (int i = 0; i < numCount; i++, isPositionOdd = !isPositionOdd) {
            double currentNumber = Double.parseDouble(scan.nextLine());
            if (isPositionOdd) {
                isThereOddPositions = true;
                oddPositionSum += currentNumber;
                oddPositionMinValue = Math.min(currentNumber, oddPositionMinValue);
                oddPositionMaxValue = Math.max(currentNumber, oddPositionMaxValue);
            }
            else {
                isThereEvenPositions = true;
                evenPositionSum += currentNumber;
                evenPositionMinValue = Math.min(currentNumber, evenPositionMinValue);
                evenPositionMaxValue = Math.max(currentNumber, evenPositionMaxValue);
            }
            
        }
        oddEvenPositionValues[0] = df.format(oddPositionSum);
        oddEvenPositionValues[1] = isThereOddPositions ? df.format(oddPositionMinValue) : "No";
        oddEvenPositionValues[2] = isThereOddPositions ? df.format(oddPositionMaxValue) : "No";
        oddEvenPositionValues[3] = df.format(evenPositionSum);
        oddEvenPositionValues[4] = isThereEvenPositions ? df.format(evenPositionMinValue) : "No";
        oddEvenPositionValues[5] = isThereEvenPositions ? df.format(evenPositionMaxValue) : "No";
        
        printResult(strings, oddEvenPositionValues);
    }
    
    private static void printResult(String[] strings, String[] oddEvenPositionValues) {
        if (strings.length == oddEvenPositionValues.length) {
            for (int i = 0; i < 6; i++) {
                System.out.print(strings[i] + oddEvenPositionValues[i]);
            }
        }
        else {
            System.out.println("neshata sa zaminali po dqvolite.");
        }
    }
}