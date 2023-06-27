public class FindingAverageElementsArray {
    public static void main(String[] args) {
        int[] numbers = {34, 55, 67, 44, 200, 55, 84};
        double sum = 0.0;

        for (int item : numbers) {
            sum += numbers.length / ((double) 1 / item);
        }

        System.out.println(sum);
    }
}
