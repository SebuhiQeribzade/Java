public class Ders6 {
    public static void main(String[] args) {

        int start = 1;
        int end = 20;
        for (int i = start; i <= end; i++) {

            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
