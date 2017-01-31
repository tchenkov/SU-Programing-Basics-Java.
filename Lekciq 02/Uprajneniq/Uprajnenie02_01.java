package Uprajneniq;

import java.util.Scanner;

//p01_SquareArea
public class Uprajnenie02_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("a = ");
        int a = Integer.parseInt(scan.nextLine());
        int area = a * a;

        System.out.println("Square area = " + area);
    }
}