import java.util.Scanner;
public class CalculateAreaAndPerimeterCircle {
    public static void main(String[] args) {
        int radius;
        double PI = 3.14, circleArea, circlePerimeteor ;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        radius = input.nextInt();

        circleArea = PI * radius * radius;
        circlePerimeteor = 2 * PI * radius;

        System.out.print("Dairenin Alanı : " + circleArea);
        System.out.print("\nDairenin Çevresi : " + circlePerimeteor);
    }
}
