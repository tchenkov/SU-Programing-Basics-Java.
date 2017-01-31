import java.util.Scanner;

public class Lekciq04_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String color = scan.nextLine();
        String fruit = scan.nextLine();

        if (fruit.equals("tomato")) {
            System.out.print("tomato is ");

            if (color.equals("red")) {
                System.out.println("its ripe");
            } else {
                System.out.println("its not ripe");
            }
        }
    }
}
