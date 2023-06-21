package practice02;

import java.util.Arrays;

public class S07_Array_IsimSiralama {
    /*
        Bir sınıfta bulunan öğrencilerin isimlerini içeren bir array verildiğinde,
        bu öğrencilerin isimlerini sıralayan bir program yazın.
        {"Ali", "Zeynep", "Mehmet", "Ayşe"}
    */
    public static void main(String[] args) {
        String [] stdNames = {"Ali", "Zeynep", "Mehmet", "Ayşe"};
        Arrays.sort(stdNames);
        System.out.println("Siralanmis Ogrenci Listesi: " + Arrays.toString(stdNames));
    }
}
