    package Uprajneniq;

    import java.text.DecimalFormat;
    import java.util.Scanner;

    /**
     * Created by todor on 23.01.2017 г..
     */
    public class u02_SmallShop {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String product = scan.nextLine().toLowerCase();
            String city = scan.nextLine().toLowerCase();
            double quantity = Double.parseDouble(scan.nextLine());
            DecimalFormat df = new DecimalFormat("#.######");

            double price = 0;

            if (city.equals("sofia")) {
                if (product.equals("coffee")) {
                    price = 0.5;
                }
                else if (product.equals("water")) {
                    price = 0.8;
                }
                else if (product.equals("beer")) {
                    price = 1.2;
                }
                else if (product.equals("sweets")) {
                    price = 1.45;
                }
                else if (product.equals("peanuts")) {
                    price = 1.6;
                }
            }
            else if (city.equals("plovdiv")) {
                if (product.equals("coffee")) {
                    price = 0.4;
                }
                else if (product.equals("water")) {
                    price = 0.7;
                }
                else if (product.equals("beer")) {
                    price = 1.15;
                }
                else if (product.equals("sweets")) {
                    price = 1.3;
                }
                else if (product.equals("peanuts")) {
                    price = 1.5;
                }
            }
            else if (city.equals("varna")) {
                if (product.equals("coffee")) {
                    price = 0.45;
                }
                else if (product.equals("water")) {
                    price = 0.7;
                }
                else if (product.equals("beer")) {
                    price = 1.1;
                }
                else if (product.equals("sweets")) {
                    price = 1.35;
                }
                else if (product.equals("peanuts")) {
                    price = 1.55;
                }
            }

            double total = price * quantity;

            System.out.printf("%s", df.format(total).replace(",", "."));
        }
    }
