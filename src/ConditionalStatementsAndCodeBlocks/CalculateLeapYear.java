package ConditionalStatementsAndCodeBlocks;
import java.util.Scanner;
public class CalculateLeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır !");
                } else {
                    System.out.println(year + " bir artık yıl değildir !");
                }
            } else {
                System.out.println(year + " bir artık yıl değildir !");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}
