public class Main {
    public static void main(String[] args) {
        int cem = 0;
        int eded = 2; // Ilk cut eded olaraq 2-den baslayiriq

        while (eded <= 100) {
            cem += eded;
            eded += 2; // Increment by 2 to get the next even number
        }

        System.out.println("100-e qeder olan cut ededlerin cemi: " + cem);
    }
}