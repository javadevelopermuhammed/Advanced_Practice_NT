package practice03;

public class S04_MethodOverloading_IsimDuzenleme {
    /*
        İki farklı method oluşturun.
          - İlk method, bir ürün adını ve fiyatını parametre olarak alacak ve bu bilgileri ekrana yazdıracak.
          - İkinci method bir ürün adı, fiyatı ve indirim oranı parametrelerini alacak ve indirimli fiyatı ekrana yazdıracak.
        Bu methodları kullanarak farklı ürünleri ve indirim oranlarını ekrana yazdırın.
            String[] urunIsimleri = {"Kalem", "Defter", "Silgi", "Cetvel"};
            double[] urunFiyatlari = {10.99, 12.49, 8.99, 15.99};
    */
    public static void main(String[] args) {
        String[] urunIsimleri = {"Kalem", "Defter", "Silgi", "Cetvel"};
        double[] urunFiyatlari = {10.99, 12.49, 8.99, 15.99};
        fiyatHesapla(urunIsimleri[0], urunFiyatlari[0]);
        indirimliFiyatHesapla(urunIsimleri[1], urunFiyatlari[1], 20);
    }

    private static void indirimliFiyatHesapla(String urunAdi, double fiyat, double indirimOrani) {
        double indirimliFiyat = fiyat - (fiyat * indirimOrani / 100);
        System.out.println("Urun Adi: " + urunAdi);
        System.out.println("Indirimli Fiyat: " + indirimliFiyat);
    }

    public static void fiyatHesapla(String urunAdi, double fiyat) {
        System.out.println("Urun Adi: " + urunAdi);
        System.out.println("Urun Fiyati: " + fiyat);
    }
}
