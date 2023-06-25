import java.util.Scanner;

public class FindingEvenNumbers {
    public static void main(String[] args) {
        int getValue;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        getValue = scanner.nextInt();

        for (int i = 0; i < getValue; i++) {
            if (i % 2  == 0) {
                System.out.println(i);
            }
        }
    }
}
