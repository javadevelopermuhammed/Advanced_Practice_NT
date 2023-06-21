package practice04;

import java.time.LocalTime;
import java.util.Scanner;

public class S02_DateTime_Saat {
        /*
         Kullanıcıya anlık saati ve dakikayı soran bir program yazmanız isteniyor.
         Ardından kullanıcının girdiği saat ve dakikayı kullanarak 1 saat 30 dakika sonrasının saatini ve dakikasını bulun.
         Elde edilen sonucu Türkçe olarak ekrana yazdırın.
         */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen anlık saat bilgisini giriniz");
            int hour = input.nextInt();
            System.out.println("dakika bilgisini giriniz");
            int min = input.nextInt();
            LocalTime girilenSaat = LocalTime.of(hour,min);

            LocalTime ilerikiSaat = girilenSaat.plusHours(1).plusMinutes(30);
            int yeniSaat = ilerikiSaat.getHour();
            int yeniDakika = ilerikiSaat.getMinute();
            System.out.println("1 saat 30 dakika sonrası" + yeniSaat + "." + yeniDakika);

        }
}
