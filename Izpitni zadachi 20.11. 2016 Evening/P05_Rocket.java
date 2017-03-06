import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 6.03.2017 г..
 */
public class P05_Rocket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String dots = "";
    
        int rocketWidth = 3 * n;
        for (int i = 0; i < n; i++) {
            dots = stringRepeater(".", ((rocketWidth / 2) - 1) - i);
            String spaces = stringRepeater(" ", rocketWidth - 2 - (2 * dots.length()));
            System.out.println(MessageFormat.format("{0}/{1}\\{0}", dots, spaces));
        }
        
        String asterisk = stringRepeater("*", rocketWidth - n);
        String rocketBodyTop = dots + asterisk + dots;
        System.out.println(rocketBodyTop);
        String rocketBody = dots + "|" + stringRepeater("\\", rocketWidth - (n + 2)) + "|" + dots;
        for (int i = 0; i < n * 2; i++) {
            System.out.println(rocketBody);
        }
    
        for (int i = 0; i < n / 2; i++) {
            dots =  stringRepeater(".", (n / 2) - i);
            asterisk = stringRepeater("*", (rocketWidth - (n + 2)) + (i * 2));
            System.out.println(MessageFormat.format("{0}/{1}\\{0}", dots, asterisk));
        }
        
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        int strLength = stringToRepeat.length() * stringRepeatCount;
        do {
            StringBuilder sb = new StringBuilder(stringToRepeat);
            stringToRepeat = sb.append(stringToRepeat).toString();
        }
        while (stringToRepeat.length() < strLength);
        return stringToRepeat.substring(0, strLength);
    }}
