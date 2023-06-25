import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int selectedAction;
        double numberOne, numberTwo;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        numberOne = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        numberTwo = input.nextDouble();
        System.out.print("\nYapılacak işlemi seçiniz; \n1->Toplama\n2->Çıkarma\n3->Çarpma\n4->Bölme\nSeçilen işlem : ");
        selectedAction = input.nextInt();

        switch (selectedAction) {
            case 1 :
                System.out.println("Toplama : " + (numberOne + numberTwo));
                break;
            case 2 :
                System.out.println("Çıkarma : " + (numberOne - numberTwo));
                break;
            case 3 :
                System.out.println("Çarpma : " + (numberOne * numberTwo));
                break;
            case 4 :
                if (numberTwo != 0) {
                    System.out.println("Bölme : " + (numberOne / numberTwo));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez !");
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem giriniz !!!");
                break;
        }
    }
}
