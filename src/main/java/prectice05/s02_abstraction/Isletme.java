package prectice05.s01_inharitance.s02_abstraction;

public class Isletme extends Kurs {

    @Override
    public String kategoriAdi(){
        return "Isletme";
    }





    @Override
    public String toString() {
        return "İsletme{" +
                "dersAdi='" + dersAdi + '\'' +
                ", ogretmenAdi='" + ogretmenAdi + '\'' +
                ", dersSaati=" + dersSaati +
                ", kursUcreti=" + kursUcreti +
                '}';
    }
}
