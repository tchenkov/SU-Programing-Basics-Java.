package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 15.02.2017 г..
 */
public class u09_House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int houseHeight = Integer.parseInt(scan.nextLine());
        int houseRoofHeight = houseHeight/2 + houseHeight % 2;
        int houseWallHeight = houseHeight/2;
        
        for (int i = 1; i <= houseRoofHeight; i++) {
            int dashesCount = houseRoofHeight - i;
            String dashes = stringRepeater("-", dashesCount);
            int starsCount = houseHeight - dashesCount*2;
            String stars = stringRepeater("*", starsCount);
            System.out.println(dashes + stars + dashes);
        }
        
        String houseBody = "|" + stringRepeater("*", houseHeight-2) + "|";
        for (int i = 0; i < houseWallHeight; i++) {
            System.out.println(houseBody);
        }
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        String outputString = "";
        for (int i = 0; i < stringRepeatCount; i++) {
            outputString += stringToRepeat;
        }
        return outputString;
    }
}
