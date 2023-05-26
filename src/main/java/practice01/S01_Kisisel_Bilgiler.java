package practice01;

public class S01_Kisisel_Bilgiler {
    public static void main(String[] args) {
         /*
     İsim, soyisim, yaş, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            İsim: ...
            Soyisim: ...
            Yaş: ...
            Boy: ...
            Kilo: ...
     Not: Sadece bir adet "System.out.println(); kullanınız.
     */
        String isim = "Muhammed Emin";
        String soyIsim = "Kaba";
        int yas = 17;
        double boy = 175;
        int kilo = 65;
        System.out.println("İsim: "+isim+"\nSoyisim: "+soyIsim+"\n\tYas: "+yas+"\n\tBoy: "+boy+"\n\tKilo: "+kilo);
    }
}
