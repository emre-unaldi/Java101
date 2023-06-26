import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        int count, total = 0;
        Scanner scanner = new Scanner(System.in);
        int numberOne = 0;
        int numberTwo = 1;

        System.out.print("Seri:");
        count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(numberOne + " ");
            total = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = total;
        }
    }
}

