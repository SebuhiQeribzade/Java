import java.util.Scanner;

public class ders14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3-ün 3-ə string array-i yaradırıq
        String[][] array = new String[3][3];
        // Fill the array with empty strings
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "";
            }
        }

        // İstifadəçidən string daxil etməyini istəyirik
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // İstifadəçidən sətir və sütünu seçməyini istəyirik
        System.out.print("Enter the row (0-2): ");
        int row = scanner.nextInt();
        System.out.print("Enter the column (0-2): ");
        int column = scanner.nextInt();

        // Yeni daxil olunmuş məlumatlar ilə array-i yeniləyirik
        array[row][column] = inputString;

        // Yenilənmiş array-i göstəririk
        System.out.println("Updated array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}