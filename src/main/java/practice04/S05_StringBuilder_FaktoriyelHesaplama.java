package practice04;

import java.util.Map;
import java.util.Scanner;

public class S05_StringBuilder_FaktoriyelHesaplama {
    /*
        Bir öğrenci, matematik dersinde, verilen bir sayının faktöriyelini hesaplamak için bir program yazmak istiyor.
        Program, kullanıcıdan bir sayı girmesini isteyecek ve faktöriyel hesaplama işlemini gerçekleştirecektir.
        Kullanıcının girdiği sayı 20'den küçük veya eşit olacaktır.
        Faktöriyel hesaplama işlemi tamamlandıktan sonra sonucu ekrana yazdıracaktır.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük veya eşit bir sayı giriniz");
        int num = input.nextInt();
        if (num<=20){
            StringBuilder sonuc = new StringBuilder();
            sonuc.append(num).append("! = ");

            int faktoriyel = 1;
            for (int i = num; i > 0; i--) {
                faktoriyel = faktoriyel*i;
                sonuc.append(i);
                if (i!=1){
                    sonuc.append(" * ");
                }
            }
            sonuc.append(" = ").append(faktoriyel);
            System.out.println(sonuc);
        }else{
            System.out.println("Geçersiz bir değer girdiniz. Sayı 20'den küçük veya eşit olmalıdır.");
        }
    }
}
