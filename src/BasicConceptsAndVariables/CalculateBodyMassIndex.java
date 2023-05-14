package BasicConceptsAndVariables;

import java.util.Scanner;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        double kg, m, bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        m = input.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kg = input.nextDouble();

        bodyMassIndex = kg / (m * m);

        System.out.println("Vücut Kitle Endeksi : " + bodyMassIndex);
    }
}
