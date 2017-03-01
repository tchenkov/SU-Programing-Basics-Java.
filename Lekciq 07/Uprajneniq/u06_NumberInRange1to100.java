package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 20.02.2017 г..
 */
public class u06_NumberInRange1to100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Еnter a number in the range [1...100]: ");
        int num = Integer.parseInt(scan.nextLine());
        while (num < 1 || 100 < num){
            System.out.println("Invalid number!");
            num = Integer.parseInt(scan.nextLine());
            System.out.print("Еnter a number in the range [1...100]: ");
        }
        System.out.printf("The number is: %d", num);
    }
}