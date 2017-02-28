package Uprajneniq;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 16.02.2017 г..
 */
public class u12_Butterfly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int butterflySizeIndex = Integer.parseInt(scan.nextLine());
        int wingsHeight = butterflySizeIndex - 2;
        
        String starString = stringRepeater("*", wingsHeight);
        String wingOfStarsTop = MessageFormat.format("{0}\\ /{0}", starString);
        String wingOfDashesTop = wingOfStarsTop.replace('*','-');
        String wingOfStarsBottom = MessageFormat.format("{0}/ \\{0}", starString);
        String wingOfDashesBottom = wingOfStarsBottom.replace('*','-');
        String butterflyBody = stringRepeater(" ", wingsHeight +1) + "@";
        
        boolean printStars = true;
        butterflyWingsOutput(wingsHeight, wingOfDashesTop, wingOfStarsTop, printStars);
        System.out.println(butterflyBody);
        butterflyWingsOutput(wingsHeight, wingOfDashesBottom, wingOfStarsBottom, printStars);
    }
    
    public static void butterflyWingsOutput(int wingsHeight, String wingOfDashesTop, String wingOfStarsBottom, boolean printStars) {
        for (int i = 0; i < wingsHeight; i++, printStars = !printStars) {
            if (printStars){
                System.out.println(wingOfStarsBottom);
            }
            else {
                System.out.println(wingOfDashesTop);
            }
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
