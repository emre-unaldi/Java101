public class FindingPrimeNumbers {
    public static void main(String[] args) {
        boolean prime;
        System.out.println("1-100 arasindaki prime sayilar: ");

        for (int i = 2; i <= 100; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}
