package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 20.02.2017 г..
 */
public class u07_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA = Integer.parseInt(scan.nextLine());
        int numB = Integer.parseInt(scan.nextLine());
        
        while (numB != 0){
            int memory = numB;
            numB = numA % numB;
            numA = memory;
        }
        
        System.out.println(numA);
    }
}