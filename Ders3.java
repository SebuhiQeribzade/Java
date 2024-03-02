package Ders3;

public class Ders3 {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int birinci= 0;
        int ikinci = 1;

        System.out.println("Fibonaççi ədədləri:");

        System.out.print(birinci + ", " + ikinci); // Print the first two numbers

        for (int i = 2; i < n; i++) {
            int sonraki = birinci + ikinci;
            System.out.print(", " + sonraki);
            birinci = ikinci;
            ikinci = sonraki;
        }
    }
}