package Uprajneniq;

import java.util.Scanner;

public class Uprajnenie02_14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //dyljina na zalata
        double w = Double.parseDouble(scan.nextLine());

        //shirina na zalata
        double h = Double.parseDouble(scan.nextLine());

        while (!((3 <= h) && (h <= w) && (w <= 100))) {
            w = Double.parseDouble(scan.nextLine());
            h = Double.parseDouble(scan.nextLine());

        }

        //shirina na koridora
        int koridor = 100;

        //razmer na biuro + stol
        int biuroW = 120;
        int biuroH = 70;

        //broi redove i koloni ot biuro + stol
        int redove = (int) (w * 100) / biuroW;
        int koloni = (int) (h * 100 - koridor) / biuroH;

        //obsht broi biuro + stol
        int broiBiura = redove * koloni - 3;

        System.out.println(broiBiura);

    }
}