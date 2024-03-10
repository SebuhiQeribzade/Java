package Ders4;
import java.util.Scanner;

public class ders13 {
    private static final int NUM_SPACES = 5;
    private static final int NUM_ATTRIBUTES = 3;
    private static String[][] garage = new String[NUM_SPACES][NUM_ATTRIBUTES];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (String[] space : garage) {
            for (int j = 0; j < NUM_ATTRIBUTES; j++) {
                space[j] = "";
            }
        }
        displayGarage();
        addCarsUntilFull();
        displayGarage();
    }

    public static void displayGarage() {
        System.out.println("Garajın hal-hazırki vəziyyəti:");
        for (int i = 0; i < NUM_SPACES; i++) {
            System.out.print("Park yeri " + (i + 1) + ": ");
            for (int j = 0; j < NUM_ATTRIBUTES; j++) {
                System.out.print(garage[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void addCarsUntilFull() {
        while (true) {
            boolean garageFull = true;
            for (int i = 0; i < NUM_SPACES; i++) {
                if (garage[i][0].isEmpty()) {
                    garageFull = false;
                    break;
                }
            }
            if (garageFull) {
                System.out.println("Bağışlayın, garaj artıq dolmuşdur.");
                break;
            }

            displayGarage();

            System.out.println("Yeni maşının detallarını daxil edin:");
            for (int i = 0; i < NUM_SPACES; i++) {
                if (garage[i][0].isEmpty()) {
                    System.out.print("Marka: ");
                    garage[i][0] = scanner.nextLine();

                    System.out.print("Model: ");
                    garage[i][1] = scanner.nextLine();

                    System.out.print("İl: ");
                    garage[i][2] = scanner.nextLine();

                    System.out.println("Maşın park yerinə uğurla əlavə olundu " + (i + 1) + ".");
                    break;
                }
            }
        }
    }
}