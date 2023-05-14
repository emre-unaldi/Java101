import java.util.Scanner;

public class KdvAmountCalculate {
    public static void main(String[] args) {
        double amount, kdvRate, kdvAmount, kdvAddedAmount;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        amount = input.nextDouble();

        kdvRate = (amount > 0 && amount < 1000 ) ? 0.18 : 0.08;
        kdvAmount = amount * kdvRate;
        kdvAddedAmount = amount + kdvAmount;

        System.out.println("KDV'siz tutar : " + amount);
        System.out.println("KDV oranı : " + kdvRate);
        System.out.println("KDV tutarı : " + kdvAmount);
        System.out.println("KDV'li tutar : " + kdvAddedAmount);
    }
}
