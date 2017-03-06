import java.util.Scanner;

/**
 * Created by todor on 6.03.2017 г..
 */
public class P02_FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int magnoliaCount = Integer.parseInt(scan.nextLine());
        int hyacinthsCount = Integer.parseInt(scan.nextLine());
        int rosesCount = Integer.parseInt(scan.nextLine());
        int cactusCount = Integer.parseInt(scan.nextLine());
        double giftPrice = Double.parseDouble(scan.nextLine());
        
        double magnoliaPrice = 3.25;
        double hyacinthsPrice = 4;
        double rosesPrice = 3.5;
        double cactusPrice = 8;
        double tax = 0.05;
        
        double salesProfit = magnoliaPrice * magnoliaCount + hyacinthsPrice * hyacinthsCount +
                             rosesPrice * rosesCount + cactusPrice * cactusCount;
        salesProfit = salesProfit - (salesProfit * tax);
        boolean isMoneyEnough = salesProfit >= giftPrice;
        double moneyDifference = Math.abs(salesProfit - giftPrice);
        if (isMoneyEnough){
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyDifference));
        }
        else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(moneyDifference));
        }
    }
}
