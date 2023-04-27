import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Giriniz: ");
        r = input.nextInt();

        System.out.print("Açı değerini giriniz: ");
        a = input.nextInt();
        
        double alan = (pi * (r * r) * a)/360;
        System.out.println("Dairenin Alanı: " + alan);
    }
}
