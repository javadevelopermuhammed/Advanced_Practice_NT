package practice01;

public class S03_Hipotenus {
    /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */
    public static void main(String[] args) {
        int a = 7;
        int b = 24;
        double hipotenus = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(hipotenus);

    }
}
