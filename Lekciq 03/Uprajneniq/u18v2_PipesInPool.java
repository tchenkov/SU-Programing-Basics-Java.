package Uprajneniq;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by todor on 18.01.2017 г..
 */
public class u18v2_PipesInPool {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int poolVolume = Integer.parseInt(scan.nextLine());
        int volumePerHourPipe1 = Integer.parseInt(scan.nextLine());
        int volumePerHourPipe2 = Integer.parseInt(scan.nextLine());
        double time = Double.parseDouble(scan.nextLine());
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        double filledVolume =  ((volumePerHourPipe1 + volumePerHourPipe2)* time);
        double volumeDifference = filledVolume - poolVolume;

        if (volumeDifference > 0) {
            System.out.printf("For %s hours the pool overflows with %s liters.", decimalFormat.format(time).replace(",", "."), decimalFormat.format(volumeDifference).replace(",", "."));
        }
        else {
            int filledPercentages = (int) ((filledVolume *100 )/ poolVolume);
            int filledPercentagesPipe1 = (int) ((volumePerHourPipe1 * time * 100) / filledVolume);
            int filledPercentagesPipe2 = (int) ((volumePerHourPipe2 * time * 100) / filledVolume);
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.", filledPercentages, filledPercentagesPipe1, filledPercentagesPipe2);
        }
    }
}
