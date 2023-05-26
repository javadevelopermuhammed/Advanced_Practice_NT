package practice01;

import java.util.Scanner;

public class S08_StringManipulations_IfElse {
    /*
        Kullanıcının girdiği bir String ifadenin son üç karakterini alarak bu üç karakteri String ifadenin başına ve sonuna ekleyen
        bir Java programı yazınız.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen en az 3 karakterli bir kelime giriniz..");
        String kelime = input.next();
        if (kelime.length()>2){
            String sonuc = kelime.substring(kelime.length()-3);
            System.out.println(sonuc+kelime+sonuc);
        }else{
            System.out.println("Lutfen en az 3 karakterli bir kelime giriniz!!");
        }
    }
}
