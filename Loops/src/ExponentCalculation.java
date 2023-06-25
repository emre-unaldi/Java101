import java.util.Scanner;

public class ExponentCalculation {
    public static void main(String[] args) {
        Integer number, power, total = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü Alıncak Sayıyı Giriniz : ");
        number = scanner.nextInt();
        System.out.print("Üs Giriniz : ");
        power = scanner.nextInt();

        for (int i = 1; i <= power ; i++) {
               total *= number;
        }

        System.out.println(number + " Sayısının " + power + "'inci kuvveti : " + total);
    }
}

