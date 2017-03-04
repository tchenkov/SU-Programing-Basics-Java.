import java.util.Scanner;

/**
 * Created by todor on 4.03.2017 г..
 */
public class P05_ChristmasHat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int hatSize = Integer.parseInt(scan.nextLine());
        int hatWidth = hatSize * 2 - 1;
    
        String dotsStarDashString = stringRepeater(".", hatWidth) +
                "*" + stringRepeater("-", hatWidth);
        String starsString = stringRepeater("*", hatSize * 4 + 1);
        String starsDotsString = stringRepeater("*.", hatSize * 2) + "*";
    
        System.out.printf("%s/|\\%<s%n", dotsStarDashString.substring(0, hatWidth));
        System.out.printf("%s\\|/%<s%n", dotsStarDashString.substring(0, hatWidth));
    
        for (int i = 0; i < hatSize * 2; i++) {
            StringBuilder sb = new StringBuilder(dotsStarDashString.substring(i,hatSize *2 + i));
            System.out.printf("%s*%s%n", sb.toString(), sb.reverse());
        }
    
        System.out.println(starsString);
        System.out.println(starsDotsString);
        System.out.println(starsString);
        
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        int strLength = stringToRepeat.length() * stringRepeatCount;
        do {
            StringBuilder sb = new StringBuilder(stringToRepeat);
            stringToRepeat = sb.append(stringToRepeat).toString();
        }
        while (stringToRepeat.length() < strLength);
        return stringToRepeat.substring(0, strLength);
    }
}
