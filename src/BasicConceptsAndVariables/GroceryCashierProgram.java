package BasicConceptsAndVariables;
import java.util.Scanner;
public class GroceryCashierProgram {
    public static void main(String[] args) {
        int pear, apple, tomato, banana, eggplant;
        double pearKgPrice = 2.14, appleKgPrice = 3.67, tomatoKgPrice = 1.11, bananaKgPrice = 0.95, eggplantKgPrice = 5.00;
        double pearTotalPrice, appleTotalPrice, tomatoTotalPrice, bananaTotalPrice, eggplantTotalPrice, totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilogram armut alacaksınız ? : ");
        pear = input.nextInt();
        System.out.print("Kaç kilogram elma alacaksınız ? : ");
        apple = input.nextInt();
        System.out.print("Kaç kilogram domates alacaksınız ? : ");
        tomato = input.nextInt();
        System.out.print("Kaç kilogram muz alacaksınız ? : ");
        banana = input.nextInt();
        System.out.print("Kaç kilogram patlıcan alacaksınız ? : ");
        eggplant = input.nextInt();

        pearTotalPrice = pear * pearKgPrice;
        appleTotalPrice = apple * appleKgPrice;
        tomatoTotalPrice = tomato * tomatoKgPrice;
        bananaTotalPrice = banana * bananaKgPrice;
        eggplantTotalPrice = eggplant * eggplantKgPrice;

        totalPrice = pearTotalPrice + appleTotalPrice + tomatoTotalPrice + bananaTotalPrice + eggplantTotalPrice;
        System.out.print("Toplam tutar  " + totalPrice + " TL");
    }
}
