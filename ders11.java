import java.util.Scanner;
public class ders11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] titles = new String[1]; // Arrays with size 1
        String[] authors = new String[1];
        int[] years = new int[1];
        System.out.println("Enter details for the book:");
        System.out.print("Title: ");
        titles[0] = scanner.nextLine();
        System.out.print("Author: ");
        authors[0] = scanner.nextLine();
        System.out.print("Year: ");
        years[0] = scanner.nextInt();
        System.out.println("\nBook Details:");
        System.out.println("Title: " + titles[0]);
        System.out.println("Author: " + authors[0]);
        System.out.println("Year: " + years[0]);
        scanner.close();
    }
}

