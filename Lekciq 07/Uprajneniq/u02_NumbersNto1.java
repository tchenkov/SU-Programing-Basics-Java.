package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 20.02.2017 г..
 */
public class u02_NumbersNto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}