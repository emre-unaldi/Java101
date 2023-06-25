import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int numberOne, numberTwo, i = 1, ebob = 1, ekok = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Küçük Sayı Giriniz : ");
        numberOne = input.nextInt();
        System.out.print("Büyük Sayı Giriniz : ");
        numberTwo = input.nextInt();

        while (i <= numberOne) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);


        while (i <= numberOne * numberTwo) {
            if (i % numberOne == 0 && i % numberTwo == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.print("Ekok: " + ekok);
    }
}
