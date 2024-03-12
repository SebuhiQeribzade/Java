package ADSIZ2;
public class Ders16 {

    // 2 integerin-in cəmini tapma metodu
    public int sum(int a, int b) {
        return a + b;
    }

    // Bir string-i n dəfə təkrarlama metodu
    public String repeatString(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    // Double array-in ortalamasını hesablayan metod
    public double calculateAverage(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    // İnteger-in cüt olmağını yoxlayan metod
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Yuxaridaki methodları yoxlayan əsas metod
    public static void main(String[] args) {
        Ders16 demo = new Ders16();

        // Test sum method
        int sumResult = demo.sum(5, 3);
        System.out.println("Sum of 5 and 3: " + sumResult);

        // Test repeatString method
        String repeatedString = demo.repeatString("Hello ", 3);
        System.out.println("Repeated String: " + repeatedString);

        // Test calculateAverage method
        double[] arr = {3.5, 2.0, 4.5, 1.5, 2.5};
        double average = demo.calculateAverage(arr);
        System.out.println("Average of array: " + average);

        // Test isEven method
        int num = 7;
        boolean isEven = demo.isEven(num);
        System.out.println(num + " is even: " + isEven);
    }
}
