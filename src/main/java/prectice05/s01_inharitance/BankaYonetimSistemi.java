package prectice05.s01_inharitance.s01_inharitance;

import java.time.LocalDate;

public class BankaYonetimSistemi {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(2000,3,10);

        BireyselMusteri bm1 = new BireyselMusteri("Ali Can",
                1523342,
                2000,
                "10234565826",
                dogumTarihi);

        System.out.println(bm1);
        System.out.println("--------------------------------");
        bm1.paraCekme(2000);

        KurumsalMusteri km1 = new KurumsalMusteri("Ahmet Yılmaz",
                13245211,
                10000,
                "12431412",
                "TechPro Education");

        System.out.println(km1);
        km1.paraYatirma(8000);

    }
}