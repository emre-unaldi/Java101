import java.util.Scanner;
public class CalculateChineseZodiac {
    public static void main(String[] args) {
        int birthYear, calculateZodiac;
        String horoscope = null;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı girin : ");
        birthYear = input.nextInt();
        calculateZodiac = birthYear % 12;

        switch (calculateZodiac) {
            case 1:
                horoscope = "Maymun";
                break;
            case 2:
                horoscope = "Horoz";
                break;
            case 3:
                horoscope = "Köpek";
                break;
            case 4:
                horoscope = "Domuz";
                break;
            case 5:
                horoscope = "Fare";
                break;
            case 6:
                horoscope = "Öküz";
                break;
            case 7:
                horoscope = "Kaplan";
                break;
            case 8:
                horoscope = "Tavşan";
                break;
            case 9:
                horoscope = "Ejderha";
                break;
            case 10:
                horoscope = "Yılan";
                break;
            case 11:
                horoscope = "At";
                break;
            case 12:
                horoscope = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz : " + horoscope);
    }
}
