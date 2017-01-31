package Uprajneniq;

import java.util.Scanner;

//Напишете програма, която чете ъгъл в радиани (rad) и го преобразува в градуси (deg).
// Потърсете в Интернет подходяща формула. Числото π в Java програми е достъпно чрез Math.PI.
// Закръглете резултата до най-близкото цяло число.
public class Uprajnenie02_10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double rad = Double.parseDouble(scan.nextLine());

        double deg = Math.toDegrees(rad);

        System.out.printf("deg = %.0f", deg);
    }
}
