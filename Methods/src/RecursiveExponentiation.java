import java.util.Scanner;
public class RecursiveExponentiation {

    public static  int powerNumber (int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * powerNumber(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        int base, exponent ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı girin : ");
        base = scanner.nextInt();
        System.out.print("Üssü girin : ");
        exponent  = scanner.nextInt();

        System.out.println(base + " üzeri " + exponent + " = " + powerNumber(base, exponent ));
    }
}
