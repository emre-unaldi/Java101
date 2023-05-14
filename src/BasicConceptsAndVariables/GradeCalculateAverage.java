package BasicConceptsAndVariables;

import  java.util.Scanner;
public class GradeCalculateAverage {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        matematik = input.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muzik = input.nextInt();

        int total = (matematik + fizik + kimya + turkce + tarih +muzik);
        double average = total / 6.00;
        String passState = (average >= 50) ? "Geçti" : "Kaldı";
        System.out.print("\nNot Ortalaması = " + average + "\nDurumu = " + passState);
    }
}
