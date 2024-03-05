import java.util.Random;
import java.util.Arrays;
public class ders10 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100); // Generates random numbers between 0 and 99
        }
        System.out.println("Yaradılan bəxtəbəxt ədədlər:");
        Arrays.sort(randomNumbers);
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        int largestNumber = randomNumbers[randomNumbers.length - 1];
        System.out.println("Ən böyük ədəd: " + largestNumber);
    }
}
