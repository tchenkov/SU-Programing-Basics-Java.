package Uprajneniq;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 15.02.2017 г..
 */
public class u07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int treeHeight = Integer.parseInt(scan.nextLine());
        String treeLog = " | ";
        String treeBranches = "*";
    
        for (int i = 0; i <= treeHeight; i++) {
            String currentBranch = stringRepeater(treeBranches, i);
            String spaces = stringRepeater(" ", treeHeight - i);
            System.out.println(MessageFormat.format("{0}{1}{2}{1}", spaces, currentBranch, treeLog));
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
