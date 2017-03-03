import java.util.Scanner;

/**
 * Created by todor on 2.03.2017 г..
 */
public class P01_Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startSpeed = Integer.parseInt(scan.nextLine());
        double speed2 = startSpeed * 1.1;
        double speed3 = speed2 * 0.95;
        
        int timeInMinutes1 = Integer.parseInt(scan.nextLine());
        int timeInMinutes2 = Integer.parseInt(scan.nextLine());
        int timeInMinutes3 = Integer.parseInt(scan.nextLine());
        
        double time1InHours  = timeInMinutes1 / 60.0;
        double time2InHours  = timeInMinutes2 / 60.0;
        double time3InHours  = timeInMinutes3 / 60.0;
        
        double distance1 = startSpeed * time1InHours;
        double distance2 = speed2 * time2InHours;
        double distance3 = speed3 * time3InHours;
        
        double distanceOverall = distance1 + distance2 + distance3;
        
        System.out.printf("%.2f", distanceOverall);
    }
}
