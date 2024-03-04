import java.util.Scanner;

public class ders7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir eded daxil edin:");
        int eded= scanner.nextInt();
        System.out.println(eded+" ededi üçün vurma cədvəli:");
        for (int i = 1; i <=10; i++) {
            System.out.println(eded+"x"+i+"="+(eded*i));
        }
            scanner.close();
    }
}
