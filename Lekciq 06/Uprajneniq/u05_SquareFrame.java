package Uprajneniq;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 15.02.2017 г..
 */
public class u05_SquareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int squareFrameSize = Integer.parseInt(scan.nextLine());
        int frameFilamentSize = squareFrameSize - 2;
    
        String frameCorner = "+ ";
        String frameLeftRightSide = "| ";
        String frameFilament = "- ";
        
        String frameTopBottomString = stringFormatter(frameCorner, frameFilament, frameFilamentSize);
        String frameMiddleString = stringFormatter(frameLeftRightSide, frameFilament, frameFilamentSize);
    
        System.out.println(frameTopBottomString);
    
        for (int i = 0; i < frameFilamentSize; i++) {
            System.out.println(frameMiddleString);
        }
    
        System.out.println(frameTopBottomString);
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        String outputString = "";
        for (int i = 0; i < stringRepeatCount; i++) {
            outputString += stringToRepeat;
        }
        return outputString;
    }
    
    static String stringFormatter(String startEndString, String middleString, int middleRepeatCount){
        return MessageFormat.format("{0}{1}{0}", startEndString, stringRepeater(middleString, middleRepeatCount));
    }
}
