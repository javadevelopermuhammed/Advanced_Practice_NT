package prectice05.s01_inharitance.s01_inharitance;

public class Musteri {
    String musteriAdi;
    int musteriNo;
    double hesapBakiyesi;

    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void paraCekme(double para){
        if (para <= hesapBakiyesi){
            hesapBakiyesi -= para;
            System.out.println("Hesabinizdan: " + para + "TL cekilmistir");
            System.out.println("yeni Bakiyeniz: " + hesapBakiyesi + "TL'dir.");
        }else{
            System.out.println("Hesap bakiyesi yetersizdir");
        }
    }
    public void paraYatirma(double para){
        hesapBakiyesi += para;
        System.out.println("Hesabiniza: " + para + "TL eklenmistir");
        System.out.println("yeni Bakiyeniz: " + hesapBakiyesi + "TL'dir.");

    }

    @Override
    public String toString() {
        return  "\n\t Musteri Adi: " + musteriAdi +
                "\n\t Musteri No: " + musteriNo +
                "\n\t Hesap Bakiyesi: " + hesapBakiyesi;
    }
}
