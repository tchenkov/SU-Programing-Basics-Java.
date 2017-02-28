package Uprajneniq;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 16.02.2017 г..
 */
public class u11_DrawFort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fortHeight = Integer.parseInt(scan.nextLine());
        
        int roofSpikesCount = fortHeight / 2;
        int roofUnderlineSignsCount = (fortHeight - 2 - roofSpikesCount) * 2;
        // Roof Strings (first string line)
        String roofTowerString = stringRepeater("^", roofSpikesCount);
        String roofUnderlineSignsString = stringRepeater("_", roofUnderlineSignsCount);
        String fortRoofString = MessageFormat.format("/{0}\\{1}/{0}\\", roofTowerString, roofUnderlineSignsString);
        // Fort Body String
        String fortBodyString = "|" + stringRepeater(" ", fortHeight*2-2) + "|";
        // Fort LastBody String
        String fortLastBodySpaces = stringRepeater(" ", roofSpikesCount+1);
        String fortLastBodyMiddle = stringRepeater("_", roofUnderlineSignsCount);
        String fortLastBodyString = MessageFormat.format("|{0}{1}{0}|", fortLastBodySpaces, fortLastBodyMiddle);
        // Bottom Strings (last string line)
        String fortBottomString =  MessageFormat.format("\\{0}/{1}\\{0}/", roofTowerString.replace('^','_'),
                                                                           roofUnderlineSignsString.replace('_',' '));
        // Fort Output
        System.out.println(fortRoofString);
        for (int i = 0; i < fortHeight - 3; i++) {
            System.out.println(fortBodyString);
        }
        System.out.println(fortLastBodyString);
        System.out.println(fortBottomString);
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        String outputString = "";
        for (int i = 0; i < stringRepeatCount; i++) {
            outputString += stringToRepeat;
        }
        return outputString;
    }
}
