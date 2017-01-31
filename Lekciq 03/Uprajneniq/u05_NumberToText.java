package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 17.01.2017 г..
 *
 * Да се напише програма, която въвежда цяло число в диапазона [0…10] и го изписва с думи на английски език.
 * Ако числото е извън диапазона, изписва “number too big”.
 *
 */
public class u05_NumberToText {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num == 0){
            System.out.println("zero");
        }
        else if (num == 1){
            System.out.println("one");
        }
        else if (num == 2){
            System.out.println("two");
        }
        else if (num == 3){
            System.out.println("three");
        }
        else if (num == 4){
            System.out.println("four");
        }
        else if (num == 5){
            System.out.println("five");
        }
        else if (num == 6){
            System.out.println("six");
        }
        else if (num == 7){
            System.out.println("seven");
        }
        else if (num == 8){
            System.out.println("eight");
        }
        else if (num == 9){
            System.out.println("nine");
        }
        else {
            System.out.println("number too big");
        }
    }
}
