package Uprajneniq;

import java.util.Scanner;
//p04_ConcatenateData
public class Uprajnenie02_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String city = scan.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, city);
    }
}