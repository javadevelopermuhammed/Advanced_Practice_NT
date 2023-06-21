package practice04;

public class S04_Varargs_Restoran {
    /*
        Java programında, bir restoranın menüsündeki yemeklerin fiyatlarını hesaplayan bir metot yazmanız isteniyor.
        Metot, menüdeki yemeklerin isimlerini ve ardından fiyatlarını almalıdır.
        Menüdeki yemeklerin fiyatları toplamını döndüren ve menüye hiç yemek eklenmediğinde 0 döndüren bir metot yazın.
    */
    public static void main(String[] args) {
        double toplam = toplamYemekFiyati("Çorba","15.55","Salata","22.25","Pide","35.95");
        System.out.println("Toplam Fiyat: " + toplam + "TL'dir. ");
    }

    public static double toplamYemekFiyati(String... yemekler){
        double toplamFiyat = 0;
        System.out.println("...Harikalar Diyarı Lokantasına Hoş Geldiniz...");
        System.out.println("__________________________");
        for (int i = 0; i <yemekler.length; i+=2) {
            String yemek = yemekler[i];
            double yemekFiyati = Double.parseDouble(yemekler[i+1]);
            toplamFiyat += yemekFiyati;
            System.out.println(yemek + "=" + yemekFiyati + "TL");
        }
        System.out.println("__________________________");
        return toplamFiyat;
    }
}
