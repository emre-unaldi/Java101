import java.util.Scanner;
public class PalindromeNumbers {
    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            System.out.println(number + " Palindrom Sayıdır");
            return true;
        } else {
            System.out.println(number + " Palindrom Sayı Değildir");
            return false;
        }
    }

    public static void main(String[] args) {
        Integer number;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Gir: ");
        number = input.nextInt();
        System.out.println(isPalindrome(number));
    }
}
