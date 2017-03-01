package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 20.02.2017 г..
 */
public class u01_Numbers1toNWithStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i+=3) {
            System.out.println(i);
        }
    }
}