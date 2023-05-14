package BasicConceptsAndVariables;

import java.util.Scanner;

public class CalculateHypotenuse {
    public static void main(String[] args) {
        int firstdge, secondEdge;
        double hypotenuse;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenarı uzunluğu : ");
        firstdge = input.nextInt();

        System.out.print("İkinci kenarı uzunluğu : ");
        secondEdge = input.nextInt();

        hypotenuse = Math.sqrt((firstdge * firstdge) + (secondEdge * secondEdge));
        System.out.println("Hipotenüs : " + hypotenuse);
    }
}
