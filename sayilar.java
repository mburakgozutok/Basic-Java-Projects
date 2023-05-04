import java.util.Scanner;

public class sayilar{
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Gir: ");
        a = input.nextInt();

        System.out.print("2. Sayıyı Gir: ");
        b = input.nextInt();

        System.out.print("3. Sayıyı Gir: ");
        c = input.nextInt();

        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("a<b<c");
            }
            else {
                System.out.println("a<c<b");
            }
        }
        else if ((b<a) && (b<c)){
                if (a<c){
                    System.out.println("b<a<c");
                }
                else {
                    System.out.println("b<c<a");
                }
        }
        else if((c<a) && (c<b)){
            if (b<a){
                System.out.println("c<b<a");
            }
            else {
                System.out.println("c<a<b");
            }
        }
    }
}