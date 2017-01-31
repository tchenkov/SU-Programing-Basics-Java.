package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 18.01.2017 г..
 *
 * Да се напише програма, която въвежда размерите на геометрична фигура и пресмята лицето й.
 * Фигурите са четири вида: квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle).
 * На първия ред на входа се чете вида на фигурата (square, rectangle, circle или triangle). Ако фигурата е квадрат,
 * на следващия ред се чете едно число – дължина на страната му. Ако фигурата е правоъгълник,
 * на следващите два реда четат две числа – дължините на страните му. Ако фигурата е кръг,
 * на следващия ред чете едно число – радиусът на кръга. Ако фигурата е триъгълник,
 * на следващите два реда четат две числа – дължината на страната му и дължината на височината към нея.
 * Резултатът да се закръгли до 3 цифри след десетичната точка
 *
 */
public class u13_AreaOfFigures {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String figure = scan.nextLine().toLowerCase();
        double area = 0;

        switch (figure){
            case "square":
                double squareSide = Double.parseDouble(scan.nextLine());
                area = squareSide * squareSide;
                break;
            case "rectangle":
                double rectangleSideA = Double.parseDouble(scan.nextLine());
                double rectangleSideB = Double.parseDouble(scan.nextLine());
                area = rectangleSideA * rectangleSideB;
                break;
            case "circle":
                double radius = Double.parseDouble(scan.nextLine());
                area = radius * radius * Math.PI;
                break;
            case "triangle":
                double triangleSide = Double.parseDouble(scan.nextLine());
                double triangleHight = Double.parseDouble(scan.nextLine());
                area = (triangleSide * triangleHight) / 2;
        }

        System.out.printf("%.3f", area);
    }
}
