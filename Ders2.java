
import java.util.Scanner;

public class Ders2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
        int guess;

        System.out.println("Ədədi tap oyununa xoş gəlmisiniz!");
        System.out.println("1 ilə 100 arasındakı gizli ədədi təxmin edin.");

        do {
            System.out.print("Texmininizi daxil edin: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Tebriklər! Düzgün tapdınız.");
            } else if (guess < secretNumber) {
                System.out.println("Çox aşağı bir daha sınayın:");
            } else {
                System.out.println("Çox yuxarı bir daha sınayın:");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}
