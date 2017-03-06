import java.util.Scanner;

/**
 * Created by todor on 7.03.2017 г..
 */
public class P06_MaxCombination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNumber = Integer.parseInt(scan.nextLine());
        int endNumber= Integer.parseInt(scan.nextLine());
        int maxCombinationCount = Integer.parseInt(scan.nextLine());
        
        
            for (int i = startNumber; i <= endNumber; i++) {
                for (int j = startNumber; j <= endNumber; j++) {
                    
                    System.out.printf("<%d-%d>", i, j);
                    maxCombinationCount--;
                    if (maxCombinationCount == 0 || (i == endNumber && j == endNumber)){
                        return;
                    }
                }
            }
        
    }
}
