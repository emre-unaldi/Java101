import java.util.Scanner;
public class CalculateFlightTicketPrice {
    public static void main(String[] args) {
        int km, age, journeyType, totalPrice;
        double kmPrice = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Yolculuk kilometresini girin : ");
        km = input.nextInt();
        System.out.print("Yolcu yaşı girin ? : ");
        age = input.nextInt();
        System.out.print("Yolculuk tek yön ise '1' çift yön ise '2' girin : ");
        journeyType = input.nextInt();

        totalPrice = (int) (km * kmPrice);

        if ((km > 0 && age > 0) && (journeyType == 1 || journeyType == 2)) {
            if (age < 12) {
                totalPrice -= (totalPrice * 50) / 100;
            } else if ((age > 12) && (age < 24)) {
                totalPrice -= (totalPrice * 10) / 100;
            } else if (age > 65) {
                totalPrice -= (totalPrice * 30) / 100;
            }

            if (journeyType == 2) {
                totalPrice -= (totalPrice * 20) / 100;
                totalPrice *= 2;
            }
            System.out.print("Toplam tutar : " + totalPrice + " TL");
        } else {
            System.out.println("Hatalı veri girdiniz");
        }
    }
}
