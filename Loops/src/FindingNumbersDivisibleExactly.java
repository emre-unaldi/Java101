import java.util.Scanner;

public class FindingNumbersDivisibleExactly {
    public static void main(String[] args) {
        int getValue, totalValue = 0, count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        getValue = scanner.nextInt();

        for (int i = 0; i < getValue; i++) {
            if (i % 3 == 0 && i % 4 == 0 & i != 0) {
                totalValue += i;
                count++;
            }
        }

        System.out.println("3 ve 4 ile Tam Bölünen Sayıların Toplamı : " + totalValue);
        System.out.println("3 ve 4 ile Tam Bölünen Sayıların Toplamı : " + (totalValue / count));
    }
}

