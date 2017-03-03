import java.util.Scanner;

/**
 * Created by todor on 2.03.2017 г..
 */
public class P02_ChangeTiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double savedMoney = Double.parseDouble(scan.nextLine());
        double floorWidth = Double.parseDouble(scan.nextLine());
        double floorLength = Double.parseDouble(scan.nextLine());
        double triangleTileSide = Double.parseDouble(scan.nextLine());
        double triangleTileHeight = Double.parseDouble(scan.nextLine());
        double tilePrice = Double.parseDouble(scan.nextLine());
        double workFee = Double.parseDouble(scan.nextLine());
        
        double floorArea  = floorLength * floorWidth;
        double tileArea = (triangleTileSide * triangleTileHeight) / 2;
        
        double tilesNeeded = Math.ceil(floorArea / tileArea) + 5;
        double moneyNeeded = (tilesNeeded * tilePrice) + workFee;
        
        boolean areMoneyEnough = moneyNeeded <= savedMoney;
        double moneyDiff = Math.abs(savedMoney - moneyNeeded);
        
        if (areMoneyEnough){
            System.out.printf("%.2f lv left.", moneyDiff);
        }
        else {
            System.out.printf("You'll need %.2f lv more.", moneyDiff);
        }
    }
}
