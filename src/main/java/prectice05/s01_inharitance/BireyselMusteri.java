package prectice05.s01_inharitance.s01_inharitance;

import java.time.LocalDate;

public class BireyselMusteri extends Musteri {
    String tckKimlikNo;
    LocalDate dogumTarihi;


    public BireyselMusteri(String musteriAdi, int musteriNo, double hesapBakiyesi, String tckKimlikNo, LocalDate dogumTarihi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
        this.tckKimlikNo = tckKimlikNo;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "BireyselMusteri: " +
                super.toString() +
                "\n\tTC Kimlik No: " + tckKimlikNo +
                "\n\tDogum Tarihi: " + dogumTarihi;
    }
}
