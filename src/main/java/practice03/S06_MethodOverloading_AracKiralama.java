package practice03;

public class S06_MethodOverloading_AracKiralama {
    /*
        Üç farklı method oluşturun.
          - İlk method, bir aracın günlük kira bedelini parametre olarak alacak ve toplam kira bedelini hesaplayıp döndürecek.
          - İkinci method, bir aracın günlük kira bedeli ve kiralama süresi parametrelerini alacak ve toplam kira bedelini hesaplayıp döndürecek.
          - Üçüncü method ise bir aracın günlük kira bedeli, kiralama süresi ve indirim oranı parametrelerini alacak ve
            indirimli toplam kira bedelini hesaplayıp döndürecek.
        Bu methodları kullanarak farklı araçların kira bedellerini hesaplayın.
    */
    public static void main(String[] args) {

        double toplamKiraBedeli1 = aracKiraHesapla(150.25);
        double toplamKiraBedeli2 = aracKiraHesapla(150.25,5);
        double toplamKiraBedeli3 = aracKiraHesapla(150.25,7,30);
        System.out.println("Toplam Kira Bedeli: " + toplamKiraBedeli1);
        System.out.println("Toplam Kira Bedeli: " + toplamKiraBedeli2);
        System.out.println("Toplam Kira Bedeli: " + toplamKiraBedeli3);
    }

    private static double aracKiraHesapla(double gunlukKiraBedeli) {
        double toplamKiraBedeli = gunlukKiraBedeli*10;
        return toplamKiraBedeli;
    }
    private static double aracKiraHesapla(double gunlukKiraBedeli,int kiralamaSuresi) {
        double toplamKiraBedeli = gunlukKiraBedeli*kiralamaSuresi*10;
        return toplamKiraBedeli;
    }
    private static double aracKiraHesapla(double gunlukKiraBedeli,int kiralamaSuresi,double indirimOrani) {
        double toplamKiraBedeli = gunlukKiraBedeli*kiralamaSuresi*indirimOrani/100*10;
        return toplamKiraBedeli;
    }
}
