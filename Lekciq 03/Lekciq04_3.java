import java.util.Scanner;

public class Lekciq04_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        if (gender.equals("f")){

            if (age < 16){
                System.out.println("Miss");
            }
            else {
                System.out.println("Mrs");
            }

        }

        else {

            if (age < 16){
                System.out.println("Master");
            }
            else {
                System.out.println("Mr");
            }
        }

    }
}
