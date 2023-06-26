import java.util.Scanner;
public class RecursiveFibonacciSeries {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        number = scanner.nextInt();

        System.out.println("Fibonacci Serisi:");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
