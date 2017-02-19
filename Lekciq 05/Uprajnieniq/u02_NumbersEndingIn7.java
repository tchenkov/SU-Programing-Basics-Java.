package Uprajnieniq;

/**
 * Created by todor on 8.02.2017 г..
 */
public class u02_NumbersEndingIn7 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
