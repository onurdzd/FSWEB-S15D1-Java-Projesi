import Model.GroceryList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        GroceryList marketList1=new GroceryList();
        boolean working=true;

        while (working) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(0 + " Uygulamayı durdur");
            System.out.println(1 + " Eleman ekle");
            System.out.println(2 + " Eleman çıkar");
            String inputText = scanner.nextLine();
            if (inputText.equals("0")) {
                System.out.println(" Uygulama durduruldu.");
                working=false;
            } else if (inputText.equals("1")) {
                System.out.println(" Eklenmesini istediğiniz elemanları giriniz.");
                String inputText1 = scanner.nextLine();
                marketList1.addItems(inputText1);
            } else if (inputText.equals("2")) {
                System.out.println(" Cıkarılmasını istediğiniz elemanları giriniz.");
                String inputText2 = scanner.nextLine();
                marketList1.removeItems(inputText2);
            } else {
                System.out.println("Hatalı değer girildi");
            }
        }
    }
}