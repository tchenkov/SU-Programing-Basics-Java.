package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 20.02.2017 г..
 */
public class u11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter even number: ");
                int number = Integer.parseInt(scan.nextLine());
                boolean isNumberEven = number % 2 == 0;
                while (!isNumberEven) {
                    System.out.println("The number is not even.");
                    System.out.print("Enter even number: ");
                    number = Integer.parseInt(scan.nextLine());
                    isNumberEven = number % 2 == 0;
                }
                System.out.println("Even number entered: " + number);
                break;
            }
            catch (NumberFormatException exceptionString) {
                System.out.println("The number is not even.");
            }
            
        }
    }
}