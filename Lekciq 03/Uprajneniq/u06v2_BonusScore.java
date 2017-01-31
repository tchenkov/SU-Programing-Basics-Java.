package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 17.01.2017 г..
 *

 Дадено е цяло число – брой точки. Върху него се начисляват бонус точки по правилата, описани по-долу.
 Да се напише програма, която пресмята бонус точките за това число и общия брой точки с бонусите.
 •	Ако числото е до 100 включително, бонус точките са 5.
 •	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
 •	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
 •	Допълнителни бонус точки (начисляват се отделно от предходните):
 o	За четно число  + 1 т.
 o	За число, което завършва на 5  + 2 т.

 *
 */
public class u06v2_BonusScore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        double bonus = 0;

        if (num <= 100){
            bonus = NumBonus(num, 1);
        }
        else if ((100 < num) && (num <= 1000)){
            bonus = NumBonus(num, 2);
        }
        else {
            bonus = NumBonus(num, 3);
        }

        if (num % 2 == 0){
            bonus += 1;
        }
        else if (num % 10 == 5){
            bonus += 2;
        }

        System.out.println(bonus);

        double numPlusBonus = num + bonus;
        System.out.println(numPlusBonus);
    }

    static double NumBonus (int number, int bonusSystem){
        double bonusValue =0;
        switch (bonusSystem){
            case 1:
                bonusValue = 5;
                break;
            case 2:
                bonusValue = number * 0.2;
                break;
            case 3:
                bonusValue = number * 0.1;
        }

        return bonusValue;
    }
}
