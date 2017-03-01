package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 21.02.2017 г..
 */
public class u16_MagicNumbers {// doMagic :)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int magicNumber = Integer.parseInt(scan.nextLine());
        
        for (int i = 111111; i < 1000000; i++) {
            if (String.valueOf(i).contains("0")){
                continue;
            }
            int currentIndex = i;
            int result = 1;
            while (currentIndex > 0){
                result *= currentIndex % 10;
                currentIndex /= 10;
            }
            if (result == magicNumber) {
                System.out.printf("%d ", i);
            }
        }
    }
}