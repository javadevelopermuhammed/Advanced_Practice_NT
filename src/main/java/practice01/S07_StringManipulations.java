package practice01;

import java.util.Scanner;

public class S07_StringManipulations {
    /*
       Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
       Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
       Örnek: Mark Hansel Twain ==> HT
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Adinizi, Ikinci Adinizi ve Soyadinizi giriniz");
        String tamIsim = input.nextLine().toUpperCase();
        //1.yol
        String ikinciAd = tamIsim.split(" ")[1];
        String soyAd = tamIsim.split(" ")[2];
        char ikinciAdIlkHarf = ikinciAd.charAt(0);
        char soyAdIlkHarf = soyAd.charAt(0);
        System.out.println(""+ikinciAdIlkHarf+soyAdIlkHarf);
        //2.yol
        char ikinciAdinIlkHarfi = tamIsim.charAt(tamIsim.indexOf(" ")+1);
        char soyAdinIlkHarfi = tamIsim.charAt(tamIsim.lastIndexOf(" ")+1);
        System.out.println(""+ikinciAdinIlkHarfi+soyAdinIlkHarfi);
    }
}
