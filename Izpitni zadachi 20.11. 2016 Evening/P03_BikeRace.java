import java.util.Scanner;

/**
 * Created by todor on 6.03.2017 г..
 */
public class P03_BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juniorRacersCount = Integer.parseInt(scan.nextLine());
        int seniorRacersCount = Integer.parseInt(scan.nextLine());
        String raceTrackType = scan.nextLine().toLowerCase();
        
        double crossCountryModifier = (juniorRacersCount + seniorRacersCount) >= 50 ? 0.25 : 0;
        double expenses = 0.05;
        double juniorsTax = 0;
        double seniorsTax = 0;
        
        switch (raceTrackType){
            case "trail":
                juniorsTax = 5.5;
                seniorsTax = 7;
                break;
            case "cross-country":
                juniorsTax = 8;
                juniorsTax -= (juniorsTax * crossCountryModifier);
                seniorsTax = 9.5;
                seniorsTax -= (seniorsTax * crossCountryModifier);
                break;
            case "downhill":
                juniorsTax = 12.25;
                seniorsTax = 13.75;
                break;
            case "road":
                juniorsTax = 20;
                seniorsTax = 21.5;
        }
        
        double totalDonation = juniorRacersCount * juniorsTax + seniorRacersCount * seniorsTax;
        totalDonation -= (totalDonation * expenses);
    
        System.out.printf("%.2f", totalDonation);
    }
}
