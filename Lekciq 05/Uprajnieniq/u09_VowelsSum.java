package Uprajnieniq;

import java.util.Scanner;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u09_VowelsSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userString = scan.nextLine();
        int sumVowelLettersValues = 0;

        for (int i = 0; i < userString.length(); i++) {
            char currentLetter = userString.charAt(i);

            switch (currentLetter) {
                case 'a':
                    sumVowelLettersValues += 1;
                    break;
                case 'e':
                    sumVowelLettersValues += 2;
                    break;
                case 'i':
                    sumVowelLettersValues += 3;
                    break;
                case 'o':
                    sumVowelLettersValues += 4;
                    break;
                case 'u':
                    sumVowelLettersValues += 5;
            }
        }

        System.out.println(sumVowelLettersValues);
    }
}
