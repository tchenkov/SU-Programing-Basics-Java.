package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u13_Histogram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberCount = Integer.parseInt(scan.nextLine());

        double numCountBelow200 = 0;
        double numCount200to399 = 0;
        double numCount400to599 = 0;
        double numCount600to799 = 0;
        double numCount800andAbove = 0;
        for (int i = 0; i < numberCount; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber >= 800){
                numCount800andAbove++;
            }
            else if (currentNumber < 200){
                numCountBelow200++;
            }
            else if (currentNumber < 400){
                numCount200to399++;
            }
            else if (currentNumber < 600){
                numCount400to599++;
            }
            else {
                numCount600to799++;
            }

        }

        double numPercentBelow200 = numCountBelow200 / numberCount * 100.0;
        double numPercent200to399 = numCount200to399 / numberCount * 100.0;
        double numPercent400to599 = numCount400to599 / numberCount * 100.0;
        double numPercent600to799 = numCount600to799 / numberCount * 100.0;
        double numPercent800andAbove = numCount800andAbove / numberCount * 100.0;

        System.out.printf("%.2f\n", numPercentBelow200);
        System.out.printf("%.2f\n", numPercent200to399);
        System.out.printf("%.2f\n", numPercent400to599);
        System.out.printf("%.2f\n", numPercent600to799);
        System.out.printf("%.2f", numPercent800andAbove);
    }

}
