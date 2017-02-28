package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 16.02.2017 г..
 */
public class u10_Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diamondWidth = Integer.parseInt(scan.nextLine());
        int diamondTopHeight = diamondWidth/2 + diamondWidth % 2;
        int diamondBottomHeight = (diamondWidth % 2) == 0 ? (diamondWidth - diamondTopHeight - 1) : (diamondWidth - diamondTopHeight);
    
        for (int i = 1; i <= diamondTopHeight; i++) {
            diamondLineOutput(diamondWidth, i);
        }
        for (int i = diamondBottomHeight; i > 0; i--) {
            diamondLineOutput(diamondWidth, i);
        }
        
    }
    
    static void diamondLineOutput(int diamondWidth, int i) {
        int sideDashesCount = (diamondWidth/2 + diamondWidth % 2) - i;
        String sideDashes = stringRepeater("-", sideDashesCount);
        int diamondBodyWidth = diamondWidth - sideDashesCount * 2;
        String diamondBody = "";
        if (diamondBodyWidth > 1){
            diamondBody = "*" + stringRepeater("-", diamondBodyWidth-2) + "*";
        }
        else {
            diamondBody = "*";
        }
        
        System.out.println(sideDashes + diamondBody + sideDashes);
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        String outputString = "";
        for (int i = 0; i < stringRepeatCount; i++) {
            outputString += stringToRepeat;
        }
        return outputString;
    }
}
