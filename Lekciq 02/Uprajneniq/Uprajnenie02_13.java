package Uprajneniq;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Uprajnenie02_13 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String bDay = scan.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int add_days = 365;
        LocalDate birthDay = LocalDate.parse(bDay, dateFormat).plusDays(add_days);

        System.out.println(dateFormat.format(birthDay));


    }
}
