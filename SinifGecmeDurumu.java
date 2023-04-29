import java.util.Scanner;

public class SinifGecmeDurumu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int fizikNotu, kimyaNotu, matematikNotu, turkceNotu, tarihNotu;

    System.out.print("Fizik notunuzu girin: ");
    fizikNotu = scanner.nextInt();

    System.out.print("Kimya notunuzu girin: ");
    kimyaNotu = scanner.nextInt();

    System.out.print("Matematik notunuzu girin: ");
    matematikNotu = scanner.nextInt();

    System.out.print("Türkçe notunuzu girin: ");
    turkceNotu = scanner.nextInt();

    System.out.print("Tarih notunuzu girin: ");
    tarihNotu = scanner.nextInt();

    int notToplami = 0, notSayisi = 0;

    if (fizikNotu >= 0 && fizikNotu <= 100) {
      notToplami += fizikNotu;
      notSayisi++;
    }

    if (kimyaNotu >= 0 && kimyaNotu <= 100) {
      notToplami += kimyaNotu;
      notSayisi++;
    }

    if (matematikNotu >= 0 && matematikNotu <= 100) {
      notToplami += matematikNotu;
      notSayisi++;
    }

    if (turkceNotu >= 0 && turkceNotu <= 100) {
      notToplami += turkceNotu;
      notSayisi++;
    }

    if (tarihNotu >= 0 && tarihNotu <= 100) {
      notToplami += tarihNotu;
      notSayisi++;
    }

    if (notSayisi > 0) {
      double ortalama = (double) notToplami / notSayisi;

      if (ortalama >= 55) {
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println("Sınıfı geçtiniz!");
      } else {
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println("Sınıfta kaldınız.");
      }
    } else {
      System.out.println("Notlar 0-100 arasında olmalıdır.");
    }
  }
}
