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
        DecimalFormat df = (DecimalFormat)nf;
        df.applyPattern("#.####");

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
            if (isPositionOdd){
                isThereOddPositions = true;
                oddPositionSum += currentNumber;
                oddPositionMinValue = MinValue(currentNumber, oddPositionMinValue);
                oddPositionMaxValue = MaxValue(currentNumber, oddPositionMaxValue);
            }
            else {
                isThereEvenPositions = true;
                evenPositionSum += currentNumber;
                evenPositionMinValue = MinValue(currentNumber, evenPositionMinValue);
                evenPositionMaxValue = MaxValue(currentNumber, evenPositionMaxValue);
            }

        }

        if (isThereOddPositions){
            if (isThereEvenPositions){
                System.out.printf("OddSum=%s, OddMin=%s, OddMax=%s, EvenSum=%s, EvenMin=%s, EvenMax=%s",
                        df.format(oddPositionSum), df.format(oddPositionMinValue), df.format(oddPositionMaxValue),
                        df.format(evenPositionSum), df.format(evenPositionMinValue), df.format(evenPositionMaxValue));
            }
            else {
                System.out.printf("OddSum=%s, OddMin=%s, OddMax=%s, EvenSum=%s, EvenMin=No, EvenMax=No",
                        df.format(oddPositionSum), df.format(oddPositionMinValue), df.format(oddPositionMaxValue),
                        df.format(evenPositionSum));
            }
        }
        else {
            System.out.printf("OddSum=%s, OddMin=No, OddMax=No, EvenSum=%s, EvenMin=No, EvenMax=No",
                    df.format(oddPositionSum),
                    df.format(evenPositionSum));
        }
    }

    static double MinValue(double currantValue, double minValue){
        if (currantValue < minValue){
            return currantValue;
        }
        else {
            return minValue;
        }
    }

    static double MaxValue(double currantValue, double maxValue){
        if (currantValue > maxValue){
            return currantValue;
        }
        else {
            return maxValue;
        }
    }


}
