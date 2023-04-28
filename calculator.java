import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        n1 = input.nextInt();

        System.out.print("Enter second number: ");
        n2 = input.nextInt();

        System.out.println("1-addition\n2-subtraction\n3-multiplication\n4-division");
        System.out.print("Choose one: ");

        select = input.nextInt();
       
        switch(select) {

            case 1: 
            select = n1+n2;
            System.out.println("Result: " + select);
            break;

            case 2: 
            select = n1-n2;
            System.out.println("Result: " + select);
            break;

            case 3: 
            select = n1*n2;
            System.out.println("Result: " + select);
            break;

            case 4:
            select = n1/n2;
            System.out.println("Result: " + select);
            break;

            default:
            System.out.println("You have done wrong");

        }
        
    }
}
