import java.util.Scanner;

public class AddingDigits {
    public static void main(String[] args) {
        Integer number, temp, step, total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        number = scanner.nextInt();
        temp = number;

        while (temp > 0) {
            step = temp % 10;
            total += step;
            temp /= 10;
        }

        System.out.println("Sayının basamak toplamı : " + total);
    }
}
