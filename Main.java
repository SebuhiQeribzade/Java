package Restoran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum;
        Scanner scanner = new Scanner(System.in);
Kabab kabab1=new Kabab();
Kabab kabab2=new Kabab();
Kabab kabab3=new Kabab();
Meze meze1=new Meze();
Meze meze2=new Meze();
Meze meze3=new Meze();
Icki icki1=new Icki();
Icki icki2=new Icki();
Icki icki3=new Icki();

kabab1.name="Lule";
kabab2.name="Tike";
kabab3.name="Antrikot";
kabab1.price=5;
kabab2.price=5;
kabab3.price=6;

meze1.name="Salat";
meze2.name="Tursu";
meze3.name="Aciko";
meze1.price=2;
meze2.price=3;
meze3.price=2;

icki1.name="Araq";
icki2.name="Kola";
icki3.name="Sirab";
icki1.price=15;
icki2.price=3;
icki3.price=2;

        System.out.println("Salam qaqa xos gelmisiz ne istiyirdiz?:");
        System.out.println("1. " + kabab1);
        System.out.println("2. " + kabab2);
        System.out.println("3. " + kabab3);
        int kababChoice = scanner.nextInt();
        System.out.print("Nece sis qaqa ? ");
        int kababQuantity = scanner.nextInt();

        System.out.println("Mezelerden bes:");
        System.out.println("1. " + meze1);
        System.out.println("2. " + meze2);
        System.out.println("3. " + meze3);
        int mezeChoice = scanner.nextInt();
        System.out.print("Bir dene besdi de he? ");
        int mezeQuantity = scanner.nextInt();

        System.out.println("Icmeye:");
        System.out.println("1. " + icki1);
        System.out.println("2. " + icki2);
        System.out.println("3. " + icki3);
        int ickiChoice = scanner.nextInt();
        System.out.print("Bir dene? ");
        int ickiQuantity = scanner.nextInt();

        Kabab selectedKabab = null;
        Meze selectedMeze = null;
        Icki selectedIcki = null;

        switch (kababChoice) {
            case 1:
                selectedKabab = kabab1;
                break;
            case 2:
                selectedKabab = kabab2;
                break;
            case 3:
                selectedKabab = kabab3;
                break;
        }

        switch (mezeChoice) {
            case 1:
                selectedMeze = meze1;
                break;
            case 2:
                selectedMeze = meze2;
                break;
            case 3:
                selectedMeze = meze3;
                break;
        }

        switch (ickiChoice) {
            case 1:
                selectedIcki = icki1;
                break;
            case 2:
                selectedIcki = icki2;
                break;
            case 3:
                selectedIcki = icki3;
                break;
        }
        if (kababChoice>3||mezeChoice>3||ickiChoice>3) {
            System.out.println("Yaxsi da qaqa mezelenmiyin");
        }
        else

        System.out.println("Sifarisiniz:");
        System.out.println("Kabab: " + selectedKabab.getName() + ", Qiymet: " + (selectedKabab.getPrice()*kababQuantity));
        System.out.println("Meze: " + selectedMeze.getName() + ", Qiymet: " + (selectedMeze.getPrice()*mezeQuantity));
        System.out.println("Icki: " + selectedIcki.getName() + ", Qiymet: " + (selectedIcki.getPrice()*ickiQuantity));

        double totalPrice = ((selectedKabab.getPrice()*kababQuantity) + (selectedMeze.getPrice()*mezeQuantity) + (selectedIcki.getPrice()*ickiQuantity));
        System.out.println("Umumi qiymet: " + totalPrice);

    }
    }

