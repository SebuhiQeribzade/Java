package Ders4;

import java.util.Scanner;

public class Ders5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess;
        String userInput;

        System.out.println("Ədədi tap oyununa xoş gəlmisiniz!");
        System.out.println("1 ilə 100 arasındakı gizli ədədi təxmin edin.");
        System.out.println("Oyunu terk etmək üçün cixis yazın");

        do {
            System.out.print("Təxmininizi daxil edin (ya da tərk etmək üçün cixis yazın): ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("cixis")) {
                System.out.println("Oyundan çıxılır. Gizli əded: " + secretNumber);
                break;
            }

            if (!userInput.matches("\\d+")) {
                System.out.println("Taxil etdiyiniz düzgün deyil. Xahiş olunur bir eded daxil edin ya da 'cixis' yazın.");
                continue;
            }

            guess = Integer.parseInt(userInput);

            if (guess == secretNumber) {
                System.out.println("Tebriklər! Düzgün tapdınız.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Çox aşağı bir daha sınayın:");
            } else {
                System.out.println("Çox yuxarı bir daha sınayın");
            }
        } while (true);

        scanner.close();
    }
}

