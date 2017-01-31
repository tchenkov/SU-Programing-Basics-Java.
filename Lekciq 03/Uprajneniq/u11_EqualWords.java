package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 18.01.2017 г..
 *
 * Да се напише програма, която въвежда две думи и проверява дали са еднакви.
 * Да не се прави разлика между главни и малки думи. Да се изведе “yes” или “no”.
 *
 */
public class u11_EqualWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word1 = scan.nextLine().toLowerCase();
        String word2 = scan.nextLine().toLowerCase();

        if (word1.equals(word2)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
