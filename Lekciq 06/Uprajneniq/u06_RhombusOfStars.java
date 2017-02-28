package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 15.02.2017 г..
 */
public class u06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rhombusSideSize = Integer.parseInt(scan.nextLine());
        String starSign = "* ";
    
        for (int i = 1; i <= rhombusSideSize; i++) {
            rhombusLineOutput(rhombusSideSize, i, starSign);
        }
    
        for (int i = rhombusSideSize - 1; i > 0 ; i--) {
            rhombusLineOutput(rhombusSideSize, i, starSign);
        }
    }
    
    static void rhombusLineOutput(int rhombusSideSize, int signsCount, String fillSign){
        int spacesCount = rhombusSideSize - signsCount;
        String outputString = stringRepeater(" ", spacesCount);
        outputString += stringRepeater(fillSign, signsCount);
        System.out.println(outputString);
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        String outputString = "";
        for (int i = 0; i < stringRepeatCount; i++) {
            outputString += stringToRepeat;
        }
        return outputString;
    }
}
