package s07_constructor_ogrenci;

public class Ogrenci_Runner {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.ad = "Ali";
        ogrenci1.yas = 12;
        ogrenci1.sinif = 5;
        System.out.println(ogrenci1);

        Ogrenci ogrenci2 = new Ogrenci("Ahmet",15,8);
        System.out.println(ogrenci2);
        //Alıştırma: Bir öğrencinin adını ve sınıfını güncelleyin ve değerlerini ekrana yazdırın
        ogrenci2.ad = "Mehmet";
        ogrenci2.sinif = 9;
        System.out.println(ogrenci2);

        /*
        Alıştırma: Ogrenci class'ına bir metot ekleyerek öğrencinin yaşını bir yıl arttıran bir işlem yapın.
        Bu metodu kullanarak bir öğrencinin yaşını bir yıl arttırın ve sonucu ekrana yazdırın.
         */
        ogrenci2.yasArttir();
        System.out.println(ogrenci2);
        ogrenci1.yasArttir();
        System.out.println(ogrenci1);

        /*
         Alıştırma: Ogrenci class'ına bir metot ekleyerek öğrenciyi bir üst sınıfa geçiren bir işlem yapın.
            Bu metodu kullanarak bir öğrencinin sınıfını bir üst sınıfa geçirin ve sonucu ekrana yazdırın.
        */

        /*
        Alıştırma: Ogrenci class'ına bir statik değişken ekleyin ve her bir öğrenci oluşturulduğunda bu değişkeni bir artırın.
            Bu sayede kaç adet öğrenci oluşturulduğunu takip edebilirsiniz.
         */



        /*
        Alıştırma: Bir statik metot ekleyerek, parametre olarak aldığı iki öğrencinin değerlerinin
            eşit olup olmadığını karşılaştıran bir metot yazın ve sonucu ekrana yazdırın.
         */




    }
}
