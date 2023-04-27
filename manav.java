import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        
        double armut, elma, domates, muz, patlican, total;
        double armutFiyat = 2.14, 
        elmaFiyat = 3.67,
        domatesFiyat = 1.11,
        muzFiyat = 0.95,
        patlicanFiyat = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldığınızı giriniz: ");
        armut = input.nextDouble();

        System.out.print("Kaç kilo elma aldığınızı giriniz: ");
        elma = input.nextDouble();

        System.out.print("Kaç kilo domates aldığınızı giriniz: ");
        domates = input.nextDouble();

        System.out.print("Kaç kilo muz aldığınızı giriniz: ");
        muz = input.nextDouble();

        System.out.print("Kaç kilo patlıcan aldığınızı giriniz: ");
        patlican = input.nextDouble();

        total = (armut*armutFiyat)+(elma*elmaFiyat)+(domates*domatesFiyat)+(muz*muzFiyat)+(patlican*patlicanFiyat);

        System.out.println("Toplam Fiyat: " + total);

    }
}
