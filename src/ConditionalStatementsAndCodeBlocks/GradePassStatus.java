package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class GradePassStatus {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, muzik, total, count = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        matematik = input.nextInt();
        if (!(matematik > 0 && matematik < 100)) {
            matematik = 0;
            count++;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if (!(fizik > 0 && fizik < 100)) {
            fizik = 0;
            count++;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if (!(kimya > 0 && kimya < 100)) {
            kimya = 0;
            count++;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (!(turkce > 0 && turkce < 100)) {
            turkce = 0;
            count++;
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if (!(muzik > 0 && muzik < 100)) {
            muzik = 0;
            count++;
        }

        total = matematik + fizik + kimya + turkce + muzik;
        average = total / (5 - count);

        if (average >= 55) {
            System.out.println("Sınıfı geçtiniz");
            System.out.println("Ortalamanız : " + average);
        } else {
            System.out.println("Sınıfta kaldınız");
            System.out.println("Ortalamanız : " + average);
        }
    }
}
