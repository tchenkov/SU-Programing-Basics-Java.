import java.util.Scanner;

/**
 * Created by todor on 3.03.2017 г..
 */
public class P03_Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int chrysanthemumsCount = Integer.parseInt(scan.nextLine());
        int rosesCount = Integer.parseInt(scan.nextLine());
        int tulipsCount = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine().toLowerCase();
        char holiday = scan.nextLine().toLowerCase().charAt(0);
        
        double holidayMultiplier = holiday == 'y' ? 1.15 : 1.0;
        final int fee = 2;
        
        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
    
    
        switch (season) {
            case "spring":
            case "summer":
                chrysanthemumsPrice = 2.0;
                rosesPrice = 4.1;
                tulipsPrice = 2.5;
                break;
            case "autumn":
            case "winter":
                chrysanthemumsPrice = 3.75;
                rosesPrice = 4.5;
                tulipsPrice = 4.15;
        }
    
        double totalPrice = (chrysanthemumsCount * chrysanthemumsPrice +
                            rosesCount * rosesPrice +
                            tulipsCount * tulipsPrice) * holidayMultiplier;
        // Tulips discount 5%
        if (tulipsCount > 7 && season.equals("spring")){
            totalPrice = totalPrice - totalPrice * 0.05;
        }
        // Roses discount 10%
        if (rosesCount >= 10 && season.equals("winter")){
            totalPrice = totalPrice - totalPrice * 0.10;
        }
        // total flowers count discount 20%
        if (chrysanthemumsCount + rosesCount + tulipsCount > 20){
            totalPrice = totalPrice - totalPrice * 0.20;
        }
        totalPrice += fee;
    
        System.out.printf("%.2f%n", totalPrice);
    }
}
