import java.util.Scanner;

/**
 * Created by todor on 6.03.2017 г..
 */
public class P04_Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int shipmentsCount = Integer.parseInt(scan.nextLine());
        
        int lightWeightTax = 200;
        int mediumWeightTax = 175;
        int highWeightTax = 120;
        
        int lightShipmentWeight = 0;
        int mediumShipmentWeight = 0;
        int highShipmentWeight = 0;
        for (int i = 0; i < shipmentsCount; i++) {
            int currentShipmentWeight = Integer.parseInt(scan.nextLine());
            if (currentShipmentWeight <= 3){
                lightShipmentWeight += currentShipmentWeight;
                continue;
            }
            
            if (currentShipmentWeight <= 11){
                mediumShipmentWeight += currentShipmentWeight;
                continue;
            }
    
            highShipmentWeight += currentShipmentWeight;
        }
        
        int totalShipmentsWeight = lightShipmentWeight + mediumShipmentWeight + highShipmentWeight;
        double averageShipmentsTax = (lightShipmentWeight * lightWeightTax +
                                   mediumShipmentWeight * mediumWeightTax +
                                   highShipmentWeight * highWeightTax) / (double)totalShipmentsWeight;
        System.out.printf("%.2f%n", averageShipmentsTax);
        weightPercentageOutput(lightShipmentWeight, totalShipmentsWeight);
        weightPercentageOutput(mediumShipmentWeight, totalShipmentsWeight);
        weightPercentageOutput(highShipmentWeight, totalShipmentsWeight);
        
    }
    
    static void weightPercentageOutput(int shipmentWeight, int totalShipmentsWeight){
        System.out.printf("%.2f%%%n", (shipmentWeight * 100.0) / totalShipmentsWeight);
    }
}
