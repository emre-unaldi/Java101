import java.util.Scanner;

public class FindingHarmonicNumbers {
    public static void main(String[] args) {
        int getValue;
        double totalD = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        getValue = scanner.nextInt();

        for (int i = 1; i <= getValue; i++) {
            totalD += (double) 1 / i;
        }

        System.out.println("Harmonik Sayı : " + totalD);
    }
}
