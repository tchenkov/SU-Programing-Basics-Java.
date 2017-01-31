package Uprajvneniq;

import java.util.Scanner;

/**
 * Created by todor on 12.12.2016 г..
 */
public class Uprajnenie01_05 {
    public static void main(String[] args) {

        //Напишете Java програма, която прочита от конзолата две числа a и b,
        // пресмята и отпечатва лицето на правоъгълник със страни a и b.

        Scanner scan = new Scanner(System.in);

        //Enter rectangle size
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a*b);
    }
}
