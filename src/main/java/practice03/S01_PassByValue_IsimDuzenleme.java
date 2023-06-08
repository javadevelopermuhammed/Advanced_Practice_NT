package practice03;

public class PassByValue {
    /*
        String içinde verilmiş bir ismin orjinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            String isim = "Ali Veli Can";
            - Tüm harleri büyük yapın.
            - Tüm harfleri küçük yapın.
            - İsmin başına ünvan ekleyin.
            - Sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
            - İsmin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
    */
    public static void main(String[] args) {
        String isim = "Ali Veli Can";
        System.out.println(isim);//Ali Veli Can
        harfleriBuyukYap(isim);//method ==> ALİ VELİ CAN
        System.out.println(isim);//Ali Veli Can
        harfleriKucukYap(isim);// method ==> ali veli can
        unvanEkle("Dr.",isim);
        isimKisaltma(isim);


    }

    private static void isimKisaltma(String deger) {

    }

    public static void unvanEkle(String unvan,String deger) {
        deger = unvan +" "+ deger;
        System.out.println(deger);
    }

    public static void harfleriKucukYap(String deger) {
        deger = deger.toLowerCase();
        System.out.println(deger);
    }

    public static void harfleriBuyukYap(String deger) {
        deger = deger.toUpperCase();
        System.out.println(deger);
    }



}
