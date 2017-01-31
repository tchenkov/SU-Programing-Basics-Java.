package Uprajvneniq;

import java.util.Scanner;

/**
 * Created by todor on 12.12.2016 г..
 */
public class Uprajnenie01_06 {
    public static void main(String[] args) {

        //Напишете Java конзолна програма, която прочита от конзолата цяло
        // положително число N и отпечатва на конзолата квадрат от N звездички

        Scanner scan = new Scanner(System.in);

        //Enter Square size
        int n = scan.nextInt();
        while (!(2 <= n && n <= 100)) {
            n = scan.nextInt();
        }

        //Square top/bottom and sides
        String star = new String(new char[n]).replace("\0", "*");
        String space = new String(new char[n - 2]).replace("\0", " ");

        //Draw square
        for (int i = 1; i <= n; i++) {
            if (!(i == 1 || i == n)) {
                System.out.println("*" + space + "*");
            } else {
                System.out.println(star);
            }

        }
    }
}