import java.util.Scanner;

public class Lekciq04_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        int productQuantity = Integer.parseInt(scan.nextLine());
        double price = 0;

        if (city.equals("sofia")){

            if (product.equals("coffee")){
                price = 0.5;
            }
            else if (product.equals("water")){
                price = 0.8;
            }else if (product.equals("beer")){
                price = 1.2;
            }else if (product.equals("sweets")){
                price = 1.45;
            }else if (product.equals("peanust")){
                price = 1.6;
            }
            else {
                System.out.println("no such product");
            }
        }
        else if (city.equals("varna")){

            if (product.equals("coffee")){
                price = 0.45;
            }
            else if (product.equals("water")){
                price = 0.7;
            }else if (product.equals("beer")){
                price = 1.1;
            }else if (product.equals("sweets")){
                price = 1.35;
            }else if (product.equals("peanust")){
                price = 1.55;
            }
            else {
                System.out.println("no such product");
            }

        }
        else if (city.equals("plovdiv")){

            if (product.equals("coffee")){
                price = 0.4;
            }
            else if (product.equals("water")){
                price = 0.7;
            }else if (product.equals("beer")){
                price = 1.15;
            }else if (product.equals("sweets")){
                price = 1.3;
            }else if (product.equals("peanust")){
                price = 1.5;
            }
            else {
                System.out.println("no such product");
            }
        }

        else {
            System.out.println("no such city");
        }

        if (price > 0){
            price*=productQuantity;
            System.out.println("price = " + price);
        }

    }
}
