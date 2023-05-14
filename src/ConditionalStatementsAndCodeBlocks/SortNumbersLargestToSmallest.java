package ConditionalStatementsAndCodeBlocks;
import java.util.Scanner;
public class SortNumbersLargestToSmallest {
    public static void main(String[] args) {
        int oneNumber, twoNumber, thirdNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayı : ");
        oneNumber = input.nextInt();
        System.out.print("İkinci sayı : ");
        twoNumber = input.nextInt();
        System.out.print("Üçüncü sayı : ");
        thirdNumber = input.nextInt();

        if ((oneNumber > twoNumber) && (oneNumber > thirdNumber)) {
            if (twoNumber > thirdNumber)  {
                System.out.println(oneNumber + " > " + twoNumber + " > " + thirdNumber);
            } else {
                System.out.println(oneNumber + " > " + thirdNumber + " > " + twoNumber);
            }
        } else if ((twoNumber > oneNumber) && (twoNumber > thirdNumber)) {
            if (oneNumber > thirdNumber) {
                System.out.println(twoNumber + " > " + oneNumber + " > " + thirdNumber);
            } else {
                System.out.println(twoNumber + " > " + thirdNumber + " > " + oneNumber);
            }
        } else if ((thirdNumber > oneNumber) && (thirdNumber > twoNumber)) {
            if (oneNumber > twoNumber) {
                System.out.println(thirdNumber + " > " + oneNumber + " > " + twoNumber);
            } else {
                System.out.println(thirdNumber + " > " + twoNumber + " > " + oneNumber);
            }
        }
    }
}
