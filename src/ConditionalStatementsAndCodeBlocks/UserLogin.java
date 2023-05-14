package ConditionalStatementsAndCodeBlocks;
import java.util.Objects;
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String username, password, usernameData = "emre", passwordData = "12345";

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı : ");
        username = input.nextLine();
        System.out.print("Şifre : ");
        password = input.nextLine();

        if (username.equals(usernameData) && password.equals(passwordData)) {
            System.out.println("Giriş başarılı");
        } else {
            if (!username.equals(usernameData)) {
                System.out.println("Kullanıcı adı yanlış");
            } else {
                System.out.println("Şifre yanlış");
                System.out.print("şifreyi sıfırlamak istiyorsanız '1' e basın : ");
                int answer = input.nextInt();
                if (answer == 1) {
                    System.out.print("Yeni şifre giriniz : ");
                    String newPassword = input.next();
                    if (Objects.equals(newPassword, passwordData)) {
                        System.out.println("Şifre oluşturulamadı, eski şifre ile aynı");
                    } else {
                        System.out.print("Şifreyi onaylayın : ");
                        String passwordAgain = input.next();
                        if (newPassword.equals(passwordAgain)) {
                            System.out.print("Yeni şifre oluşturuldu : " + newPassword);
                        } else {
                            System.out.println("Şifre uyuşmuyor. Tekrar deneyin");
                        }
                    }
                } else {
                    System.out.println("Şifre sıfırlamak için '1' e basmalısınız");
                }
            }
        }
    }
}
