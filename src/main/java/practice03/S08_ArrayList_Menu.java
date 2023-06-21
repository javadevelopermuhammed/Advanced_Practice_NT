package practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S08_ArrayList_Menu {

    /*
        Bir restoraın menüsüne eklenecek öğeleri kullanıcıdan alarak List'e ekleyin ve menüyü ekrana yazdırın.
    */

     public static void main(String[] args) {
         List<String> menu = new ArrayList<>();
         Scanner input = new Scanner(System.in);

         String secenek;
         do {
             System.out.println("Lutfen menuye bir yemek ekleyiniz");
             String yemek = input.nextLine();
             if (menu.contains(yemek)){
                 System.out.println(yemek + "menude bulunmaktadir Tekrar eklenemez");
             }else{
                 menu.add(yemek);
                 System.out.println(yemek + " menuye eklenmistir");
             }


             System.out.println("Baska yemek eklemek ister misniz (E/H)");
             secenek = input.nextLine();
         }while (secenek.equalsIgnoreCase("E"));
         System.out.println("Restorant Menusu: ");
         for (String yemek :menu) {
             System.out.println(" -" + yemek);
         }
     }
}
