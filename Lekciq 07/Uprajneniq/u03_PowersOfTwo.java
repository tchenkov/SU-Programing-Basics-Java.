package Uprajneniq;
import java.util.Scanner;

/**
 * Created by todor on 20.02.2017 г..
 */
public class u03_PowersOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 1;
        for (int i = 0; i <= n; i++){
            System.out.println(num);
            num *= 2;
        }
    }
}