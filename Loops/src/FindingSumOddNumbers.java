import java.util.Scanner;

public class FindingSumOddNumbers {
    public static void main(String[] args) {
        int getValue, oddTotalNumbers = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            getValue = scanner.nextInt();

            if (getValue % 4 == 0) {
                oddTotalNumbers += getValue;
            }
        } while (getValue % 2 == 0);

        System.out.print("Girilen Sayılardan 4'ün Katı Olan Sayıların Toplamı : " + oddTotalNumbers);
    }
}
