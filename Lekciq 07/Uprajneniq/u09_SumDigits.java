package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 20.02.2017 г..
 */
public class u09_SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int digitsSum = 0;
        
        while (num > 0){
            digitsSum += num % 10;
            num /= 10;
        }
        System.out.println(digitsSum);
    }
}