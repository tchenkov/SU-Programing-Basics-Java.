import java.util.Scanner;

/**
 * Created by todor on 4.03.2017 г..
 */
public class P05_ChristmasHat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int hatSize = Integer.parseInt(scan.nextLine());
        
        String dotsStarDashString = stringRepeater(".", hatSize * 2 - 1) +
                "*" + stringRepeater("-", hatSize * 2 - 1);
        String starsString = stringRepeater("*", hatSize * 4 + 1);
        String starsDotsString = stringRepeater("*.", hatSize * 2) + "*";
    
        System.out.printf("%s/|\\%<s%n", dotsStarDashString.substring(0, hatSize *2 - 1));
        System.out.printf("%s\\|/%<s%n", dotsStarDashString.substring(0, hatSize *2 - 1));
    
        for (int i = 0; i < hatSize * 2; i++) {
            StringBuilder sb = new StringBuilder(dotsStarDashString.substring(i,hatSize *2 + i));
            System.out.printf("%s*%s%n", sb.toString(), sb.reverse());
        }
    
        System.out.println(starsString);
        System.out.println(starsDotsString);
        System.out.println(starsString);
        
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringRepeatCount; i++) {
            sb.append(stringToRepeat);
        }
        return sb.toString();
    }
}
