package Uprajneniq;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 15.02.2017 г..
 */
public class u08_Sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sunglassesSize = Integer.parseInt(scan.nextLine());
        int glassSize = sunglassesSize - 2;
        String sunglassesFrameSign = "*";
        String glassesSign = "/";
        String sunglassesBridgeSign = "|";
        
        String sunglassesFrame = MessageFormat.format("{0}{1}{0}",
                                                        stringRepeater(sunglassesFrameSign, sunglassesSize * 2),
                                                        stringRepeater(" ", sunglassesSize));
        String sunglassesBody = MessageFormat.format("*{0}*{1}*{0}*",
                                                        stringRepeater(glassesSign, sunglassesSize * 2 - 2),
                                                        stringRepeater(" ", sunglassesSize));
        System.out.println(sunglassesFrame);
    
        int bridgePosition = glassSize / 2 + glassSize % 2;
        //int bridgePosition = glassSize - glassSize / 2;
                       
        for (int i = 1; i <= glassSize; i++) {
            if (bridgePosition == i){
                System.out.println(sunglassesBody.replace(" ", sunglassesBridgeSign));
            }
            else {
                System.out.println(sunglassesBody);
            }
    
        }
    
        System.out.println(sunglassesFrame);
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        String outputString = "";
        for (int i = 0; i < stringRepeatCount; i++) {
            outputString += stringToRepeat;
        }
        return outputString;
    }
}
