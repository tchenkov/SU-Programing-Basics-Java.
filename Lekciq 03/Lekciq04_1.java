import java.util.Scanner;

public class Lekciq04_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String color = scan.nextLine();

        if (color.equals("purple")){
            System.out.println("eggplant");
        }
        else if (color.equals("red")){
            System.out.println("tomato");
        }

    }
}
