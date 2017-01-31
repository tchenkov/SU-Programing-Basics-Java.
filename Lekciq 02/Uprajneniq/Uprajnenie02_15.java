package Uprajneniq;

import java.util.Scanner;

public class Uprajnenie02_15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //cena zelenchuci
        double n = Double.parseDouble(scan.nextLine());

        //cena polodove
        double m = Double.parseDouble(scan.nextLine());

        //BGN to EUR
        double eur = 1.94;

        int tegloZelenchuci = Integer.parseInt(scan.nextLine());
        int tegloPolodove = Integer.parseInt(scan.nextLine());

        double prihodEur = ((tegloZelenchuci * n) + (tegloPolodove * m)) / eur;

        System.out.printf("%.13f", prihodEur);

    }
}