import java.util.Scanner;

/**
 * Created by todor on 2.03.2017 г..
 */
public class P06_LettersCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char firstLetter = scan.next().charAt(0);
        char lastLetter = scan.next().charAt(0);
        char excludeLetter = scan.next().charAt(0);
        int counter = 0;
        
        for (char i = firstLetter; i <= lastLetter; i++) {
            if (i != excludeLetter) {
                
                for (char j = firstLetter; j <= lastLetter; j++) {
                    if (j != excludeLetter) {
                        
                        for (char k = firstLetter; k <= lastLetter; k++) {
                            if (k != excludeLetter) {
                                String string = "" + i + j + k + " ";
                                System.out.print(string);
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        
        System.out.print(counter);
    }
}
