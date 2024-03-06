import java.util.Scanner;
public class ders12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int number = scanner.nextInt();
        String original = String.valueOf(number);
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed)) {
            System.out.println(number + " palindromdur.");
        } else {
            System.out.println(number + " palindrom deyil.");
        }
        scanner.close();
    }
}
