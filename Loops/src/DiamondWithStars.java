import java.util.Scanner;
public class DiamondWithStars {
    public static void main(String[] args) {
        int height;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yüksekliği Giriniz : ");
        height = scanner.nextInt();

        for (int i = 0; i < height / 2 + 1; i++) {
            for (int j = 0; j < height / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = height / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < height / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
