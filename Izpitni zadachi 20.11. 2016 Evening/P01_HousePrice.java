import java.util.Scanner;

/**
 * Created by todor on 6.03.2017 г..
 */
public class P01_HousePrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double smallestRoomArea = Double.parseDouble(scan.nextLine());
        double kitchenArea = Double.parseDouble(scan.nextLine());
        double pricePerSquareMeter = Double.parseDouble(scan.nextLine());
        double bathroomArea = smallestRoomArea / 2;
        double secondRoomArea = smallestRoomArea + (smallestRoomArea * 0.10);
        double thirdRoomArea = secondRoomArea + (secondRoomArea * 0.10);
        
        double houseArea = (kitchenArea + bathroomArea + smallestRoomArea + secondRoomArea + thirdRoomArea) * 1.05;
        double totalPrice = houseArea * pricePerSquareMeter;
    
        System.out.printf("%.2f", totalPrice);
        
    }
}
