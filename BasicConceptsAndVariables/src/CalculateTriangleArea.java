import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        int firstEdge, secondEdge, thirdEdge;
        double perimeteorTriangle, uValue, areaTriangle;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğu : ");
        firstEdge = input.nextInt();

        System.out.print("İkinci kenar uzunluğu : ");
        secondEdge = input.nextInt();

        System.out.print("Üçüncü kenar uzunluğu : ");
        thirdEdge = input.nextInt();

        uValue = (firstEdge + secondEdge + thirdEdge) / 2.00;
        perimeteorTriangle = uValue * 2;
        areaTriangle = Math.sqrt(uValue * (uValue - firstEdge) * (uValue - secondEdge)* (uValue - thirdEdge));

        System.out.print("Üçgenin Çevresi : " + perimeteorTriangle);
        System.out.print("\nÜçgenini Alanı : " + areaTriangle);
    }
}
