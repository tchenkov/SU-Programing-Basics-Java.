package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 20.02.2017 г..
 */
public class u10_CheckPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        // algorityma sym go izmislql az za tova ne e krasiv i optimiziran.
        // iskah da si go razpisha po moi nachin.
        if (number < 2){
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0){
                System.out.println("Not Prime");
                return;
            }
        }
        
        System.out.println("Prime");
    }
}