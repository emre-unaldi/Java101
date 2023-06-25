import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int passwordRight = 3, balance = 11402, select, price;

        while (passwordRight > 0) {
            System.out.print("Kullanıcı Adı Giriniz : ");
            userName = scanner.nextLine();
            System.out.print("Parola Giriniz : ");
            password = scanner.nextLine();

            if (userName.equals("emre1189") && password.equals("1189038")) {
                System.out.println("Merhaba, İncesu Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-> Para Yatırma \n" + "2-> Para Çekme \n" + "3-> Bakiye Sorgula \n" + "4-> Çıkış yap");
                    System.out.print("İşlem Seçiniz : ");
                    select = scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı : ");
                            price = scanner.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= price;
                            }

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                passwordRight--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (passwordRight == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + passwordRight);
                }
            }
        }

    }
}
