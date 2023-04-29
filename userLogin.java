import java.util.Scanner;

public class userLogin{
    public static void main(String[] args) {
        
        String userName, Password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        userName = input.nextLine();
        
        System.out.print("Enter Password: ");
        Password = input.nextLine();

        if(userName.equals("JavaPatikasi") && Password.equals("Java101")){
            System.out.println("Login successful!");
            
        }
        else{
            System.out.println("Incorrect entry!");
        };

        if (!Password.equals("Java101")){
            
            System.out.print("Create new password: ");
            newPassword = input.nextLine();
            System.out.println("New password has been created.");
        }
        else{
           
        };
    }
}