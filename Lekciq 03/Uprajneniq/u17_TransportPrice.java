package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 18.01.2017 г..
 *
 *
 Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:
 •	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
 •	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
 •	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
 Напишете програма, която въвежда броя километри n и период от деня (ден или нощ)
 и изчислява цената на най-евтиния транспорт.
 Вход
 От конзолата се четат два реда:
 •	Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000].
 •	Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта.
 Изход
 Да се отпечата на конзолата най-ниската цена за посочения брой километри.

 */
public class u17_TransportPrice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int travelDistance = Integer.parseInt(scan.nextLine());
        String travelTime = scan.nextLine();
        double minimumPrice;

        if (travelDistance < 20){
            minimumPrice = TaxiPrice(travelDistance, travelTime);
        }
        else if (travelDistance < 100) {
            minimumPrice = Math.min(TaxiPrice(travelDistance, travelTime), BusPrice(travelDistance));
        }
        else {
            minimumPrice = Math.min(TaxiPrice(travelDistance, travelTime), Math.min(
                                                                                    BusPrice(travelDistance),
                                                                                    TrainPrice(travelDistance)
                                                                                   )
                                    );
        }

        System.out.printf("%.2f",minimumPrice);

    }

    static double TaxiPrice (int distance, String dayOrNight) {
        double price = Double.MAX_VALUE;

        double tax = 0.7;
        double dayPricePerDistance = 0.79;
        double nightPricePerDistance = 0.90;

        if (dayOrNight.equals("day")){
            price = (distance * dayPricePerDistance) + tax;
        }
        else if (dayOrNight.equals("night")) {
            price = (distance * nightPricePerDistance) + tax;
        }

        return price;
    }

    static double BusPrice (int distance) {
                double pricePerDistance = 0.09;
        double price = pricePerDistance * distance;

        return price;
    }

    static double TrainPrice (int distance) {
        double pricePerDistance = 0.06;
        double price = pricePerDistance * (double) distance;

        return price;
    }
}
