package Uprajvneniq;

/**
 * Created by todor on 12.12.2016 г..
 */
public class Uprajnenie01_04 {
    public static void main(String[] args) {

        //Напишете Java конзолна програма, която отпечатва триъгълник от 55 звездички, разположени на 10 реда

        String star = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println(star);
            star+="*";

        }
    }
}
