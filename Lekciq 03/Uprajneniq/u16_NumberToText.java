package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 18.01.2017 г..
 *
 * Да се напише програма, която превръща число [0…100] в текст: 25  “twenty five”.
 * Ако числото не е в диапазона, принтирайте „invalid number”.
 */
public class u16_NumberToText {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());



        if ((num < 0) || (100 < num)) {
            System.out.println("invalid number");
        }
        else if (num == 100) {
            System.out.println("one hundred");
        }
        else if (num == 0) {
            System.out.println("zero");
        }
        else if (num <= 9) {
            System.out.println(DigitToText(num));
        }
        else if (num <=19) {
            System.out.println(TeensToText(num));
        }
        else {
            if (num % 10 == 0){
                System.out.println(TensToText(num));
            }
            else {
                System.out.println(TensToText(num) + " " + DigitToText(num % 10));
            }
        }
    }

    static String DigitToText (int digit) {
        String digitsText = null;
        switch (digit) {
            case 1:
                digitsText = "one";
                break;
            case 2:
                digitsText = "two";
                break;
            case 3:
                digitsText = "three";
                break;
            case 4:
                digitsText = "four";
                break;
            case 5:
                digitsText = "five";
                break;
            case 6:
                digitsText = "six";
                break;
            case 7:
                digitsText = "seven";
                break;
            case 8:
                digitsText = "eight";
                break;
            case 9:
                digitsText = "nine";
        }

        return digitsText;
    }

    static String TensToText (int tens) {
        String tensText = null;
        switch (tens/10) {
            case 2:
                tensText = "twenty";
                break;
            case 3:
                tensText = "thirty";
                break;
            case 4:
                tensText = "fourty";
                break;
            case 5:
                tensText = "fifty";
                break;
            case 6:
                tensText = "sixty";
                break;
            case 7:
                tensText = "seventy";
                break;
            case 8:
                tensText = "eighty";
                break;
            case 9:
                tensText = "ninety";
        }

        return tensText;
    }

    static String TeensToText(int teen) {
        String teensText = null;
        switch (teen) {
            case 10:
                teensText = "ten";
                break;
            case 11:
                teensText = "eleven";
                break;
            case 12:
                teensText = "twelve";
                break;
            case 13:
                teensText = "thirteen";
                break;
            case 14:
                teensText = "fourteen";
                break;
            case 15:
                teensText = "fifteen";
                break;
            case 16:
                teensText = "sixteen";
                break;
            case 17:
                teensText = "seventeen";
                break;
            case 18:
                teensText = "eighteen";
                break;
            case 19:
                teensText = "nineteen";
        }
        return teensText;
    }
}
