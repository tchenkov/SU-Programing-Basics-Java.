package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 20.02.2017 г..
 */
public class u08_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factorial = Integer.parseInt(scan.nextLine());
        int result = 1;
        for (int i = 2; i <= factorial; i++) {
            result *= i;
        }
        
        System.out.println(result);
    }
}