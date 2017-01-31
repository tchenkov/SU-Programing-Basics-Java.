package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u04_FruitOrVegetable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine().toLowerCase();

        switch (product) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
