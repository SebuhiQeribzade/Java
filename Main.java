package Ders8;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Car klasının nümunələrini yaradırıq
        Car car1 = new Car("Nissan", "Maxima", 2005);
        Car car2 = new Car("Chevrolet", "Cruze", 2014);

        // İlkin xüsusiyyətləri daxil edirik
        System.out.println("Car 1 Details:");
        car1.displayDetails();
        System.out.println();

        System.out.println("Car 2 Details:");
        car2.displayDetails();
        System.out.println();

        // Maşın xüsusiyyətlərini yeniləirik
        car1.year = 2022;
        car2.model = "Malibu";

        // Yenilənmiş xüsusiyyətləri göstəririk
        System.out.println("Car 1 Modified Details:");
        car1.displayDetails();
        System.out.println();

        System.out.println("Car 2 Modified Details:");
        car2.displayDetails();
        System.out.println();
    }
}
