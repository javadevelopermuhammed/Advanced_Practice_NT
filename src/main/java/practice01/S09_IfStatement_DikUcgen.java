package practice01;

import java.util.Scanner;

public class S09_IfStatement_DikUcgen {
    /*
        Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Not: Bir üçgenin dik olduğunu anlamak için a^2 + b^2 = c^2 pisagor bağlantısından yararlanabilirsiniz)
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("3 kenar uzunlugu giriniz..");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        boolean hipotenus = Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2);
        boolean hipotenus2 = Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2);
        boolean hipotenus3 = Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2);

        if (hipotenus==true){
            System.out.println("Bu bir dik ucgendir..");
        }else if(hipotenus2==true){
            System.out.println("Bu bir dik ucgendir..");
        }else if(hipotenus3==true){
            System.out.println("Bu bir dik ucgendir..");
        }else{
            System.out.println("Bu bir dik ucgen degildir");
        }
    }
}
