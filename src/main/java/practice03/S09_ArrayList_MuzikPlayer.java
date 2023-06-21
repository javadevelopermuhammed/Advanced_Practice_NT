package practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S09_ArrayList_MuzikPlayer {

    public static void main(String[] args) {
        ArrayList<String> playList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int menu = -1;
        while (menu != 0) {
            System.out.println("\t\t\t" + "MENU");
            System.out.println("-----------------------------");
            System.out.println("     Sarkilarinizi" + "\n" +
                    "Eklemek icin    :1'e \n" +
                    "Duzenlemek icin :2'ye \n" +
                    "Silmek icin     :3'e" + "\n" +
                    "Cikmak icin     :0'a + \"\n" +
                    "Menuyu tekrar gormek icin baska bir tusa basiniz");
            System.out.println("-----------------------------");
            menu = input.nextInt();
            if (menu == 1) {

                System.out.println("lütfen eklemek istediğiniz şarkıyı yazın");
                input.nextLine();
                String ekle = input.nextLine();
                playList.add(ekle);
                sarkiGor(playList);

            } else if (menu == 2) {
                sarkiGor(playList);
                System.out.println("Lutfen Hangi sarkilari degisecegini secin");
                int degisecekSarkiIdx = input.nextInt() - 1;
                int gelecegiSiraIdx = input.nextInt() - 1;
                Collections.swap(playList, degisecekSarkiIdx, gelecegiSiraIdx);
                sarkiGor(playList);
            } else if (menu == 3) {


                do {
                    System.out.println("Sarki silmek icin numarasını giriniz,cıkmak icin 0'a basiniz");
                    sarkiGor(playList);
                    int sarkiNumarasi = input.nextInt();
                    if (sarkiNumarasi == 0) {
                        break;
                    } else {

                        playList.remove(sarkiNumarasi - 1);

                    }

                } while (true);

            }

        }
    }
    public static void sarkiGor(List<String> liste) {//bu medot diger islemleri yaptiktan sonra kullanici
        System.out.println("--------------------");         //listeleri gorebilsin diye yazdik
        int i = 0;
        for (String w : liste) {
            w = liste.get(i);
            i++;
            System.out.println(i + ") " + w);

        }
    }
}
