package practice03;

public class S02_PassByValue_SayiDuzenleme {
    /*
        İçinde verilmiş bir sayının orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            int sayi = 42;
            - Sayıyı karesini alın.
            - Sayıyı küpünü alın.
            - Sayının karekökünü alın.
            - Sayının mutlak değerini alın.
            - Sayıyı 10 ile çarpın ve sonucu yazdırın.
    */
    public static void main(String[] args) {
        int sayi = 42;
        System.out.println(sayi);
        karesiniAl(sayi);
        System.out.println(karesiniAl(sayi));
        kupunuAl(sayi);
        System.out.println(kupunuAl(sayi));
        kareKokunuAl(sayi);
        System.out.println(kareKokunuAl(sayi));
        mutlakDegerAl(sayi);
        System.out.println(mutlakDegerAl(sayi));
        System.out.println(sayi*10);
    }

    private static int mutlakDegerAl(int deger) {
        deger = Math.abs(deger);
        return deger;
    }

    private static int kareKokunuAl(int deger) {
        deger = (int) Math.sqrt(deger);
        return deger;
    }

    private static int kupunuAl(int deger) {
        deger = (int) Math.pow(deger,3);
        return deger;
    }

    private static int karesiniAl(int deger) {
        deger = (int) Math.pow(deger,2);
        return deger;
    }


}
