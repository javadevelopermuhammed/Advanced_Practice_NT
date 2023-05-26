package practice01;

import java.util.Scanner;

public class S04_Hipotenus_Method {
    /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("a kenarinin uzunlugunu giriniz..");
        double a = input.nextDouble();
        System.out.println("b kenarinin uzunlugunu giriniz..");
        double b = input.nextDouble();

        System.out.println("Hipotenus = " + hipotenusHesapla(a, b));

    }

    private static double hipotenusHesapla(double a, double b) {
        double hipotenus = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return hipotenus;
    }
}
