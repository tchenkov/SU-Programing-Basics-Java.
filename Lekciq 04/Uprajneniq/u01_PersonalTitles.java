package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u01_PersonalTitles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String  gender = scan.nextLine().toLowerCase();

        if (gender.equals("m")) {
            if (age < 16) {
                System.out.println("Master");
            }
            else {
                System.out.println("Mr.");
            }
        }
        else if (gender.equals("f")) {
            if (age < 16) {
                System.out.println("Miss");
            }
            else {
                System.out.println("Ms.");
            }
        }
    }
}
