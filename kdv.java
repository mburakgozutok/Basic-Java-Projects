import java.util.Scanner;

public class kdv{
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücreti Giriniz: ");
        tutar = input.nextDouble();
        kdvOran = 0.18;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }

}