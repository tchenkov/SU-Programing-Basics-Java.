package Uprajneniq;

import java.util.Scanner;

//Правоъгълник е зададен с координатите на два от своите срещуположни ъгъла (x1, y1) – (x2, y2).
// Да се пресметнат площта и периметъра му. Входът се чете от конзолата.
// Числата x1, y1, x2 и y2 са дадени по едно на ред. Изходът се извежда на конзолата и
// трябва да съдържа два реда с по една число на всеки от тях – лицето и периметъра
public class Uprajnenie02_07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double a = Double.max(x1, x2) - Double.min(x1, x2);
        double b = Double.max(y1, y2) - Double.min(y1, y2);

        double area = a * b;
        double perimeter = (a + b) * 2;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
