import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz: ");
        a = girdi.nextInt();
        System.out.print("İkinci Kenarı Giriniz: ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);

    }
}
