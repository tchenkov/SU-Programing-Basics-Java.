package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u10_AnimalType {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine().toLowerCase();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
                default:
                    System.out.println("unknown");
        }
    }
}
