package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 18.01.2017 г..
 *
 * Да се напише програма, която въвежда парола (един ред с произволен текст) и проверява дали въведеното съвпада
 * с фразата “s3cr3t!P@ssw0rd”. При съвпадение да се изведе “Welcome”. При несъвпадение да се изведе “Wrong password!”.
 */
public class u09_PasswordGuess {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myPassword = "s3cr3t!P@ssw0rd";
        String userPassword = scan.nextLine();

        if (myPassword.equals(userPassword)){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }

    }
}
