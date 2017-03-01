package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 21.02.2017 г..
 */
public class u13_NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int endNumber = Integer.parseInt(scan.nextLine());
        int i = 1;
        int num = 1;
        while (true){
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ", num);
                if (num == endNumber){
                    return;
                }
                num++;
            }
            i++;
            System.out.println();
        }
    }
}