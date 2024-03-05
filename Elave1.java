import java.util.Scanner;
public class Elave1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Dükkana xoş gəlmisən!");
        System.out.println("Ürəyin nə istiyir yaz görəy bura (qurtaranda da yaz 'bitdi'):");
        String[] groceryList = new String[10];
        int itemCount = 0;
        String item = scanner.nextLine();
        boolean itemsEntered = !item.equalsIgnoreCase("bitdi");
        while (!item.equalsIgnoreCase("bitdi")) {
            if (item.equalsIgnoreCase("siqaret")) {
                System.out.println("Dişlərin sapsarı olub, bəsdi dəə!");
            } else if (item.equalsIgnoreCase("araq")) {
                System.out.println("ya alkaşsan ya da hansısa dostunun ad günüdü");
            } else if (item.equalsIgnoreCase("corek")) {
                System.out.println("Evə əppəy aparırsan hə?");
            } else {
                groceryList[itemCount] = item;
                itemCount++;
            }
            if (itemCount < groceryList.length) {
                System.out.println("Nəsə istiyirsən?İstəmirsənsə bitdi yaz getsin:");
                item = scanner.nextLine();
            } else {
                System.out.println("Day cibində pul qalmadı! Yaz 'bitdi' sən də qurtul mən də:");
                item = scanner.nextLine();
            }
        }
        if (!itemsEntered) {
            System.out.println("Məzələnirsən?");
        } else {
            System.out.println("\nBaxax görəy nə almısan:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println((i + 1) + ". " + groceryList[i]);
            }

            System.out.println("Bir də gəl, nisyə mal verilmir ha, yaddan çıxmasın.");
            scanner.close();
        }
    }
}

