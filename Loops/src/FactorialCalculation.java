import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Integer n, r, combination = 1, nFactorial = 1, rFactorial = 1, nMinusRFactorial = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("n Değerini Giriniz : ");
        n = scanner.nextInt();

        System.out.print("r Değerini Giriniz : ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            nMinusRFactorial *= i;
        }

        combination = nFactorial / (rFactorial * nMinusRFactorial);
        System.out.print("C(" + n + "," + r +") = " + combination);
    }
}
