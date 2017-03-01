package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 21.02.2017 г..
 */
public class u12_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fibonacciNumberIndex = Integer.parseInt(scan.nextLine());
        
        int fib0 = 1;
        int fib1 = 1;
        for (int i = 2; i <= fibonacciNumberIndex; i++) {
            int currentFib = fib0 + fib1;
            fib0 = fib1;
            fib1 = currentFib;
        }
        
        System.out.println(fib1);
    }
}