import java.util.Scanner;

public class ders8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir ədəd daxil edin:");
        int eded= scanner.nextInt();
        long factorial=1;
        for (int i = 2; i <eded ; i++) {
            factorial*=i;

        }
        System.out.println(eded+" ədədinin faktorialı:"+factorial);
        scanner.close();
    }
}
