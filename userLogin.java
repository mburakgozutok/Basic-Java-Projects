import java.util.Scanner;

import javax.swing.SortOrder;

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
        else {
            System.out.println("Login Error!");
            }
            
        if (!Password.equals("Java101")) {
            System.out.println("Incorrect Password! Would you like to reset your password? (Y/N)");
            String reply = input.nextLine();
           
            if (reply.equals("Y")){
                System.out.print("Set your new password: ");
                newPassword = input.nextLine();

                if(newPassword.equals("Java101")){
                    System.out.print("Could not create password! Please enter another password: ");
                    newPassword = input.nextLine();
                    System.out.println("Password successfully created.");
                }
            }
        }
            
    }
}

/*
        newPassword = input.nextLine();
 
        if (!Password.equals("Java101")){
            
            System.out.print("Create new password: ");
            
        }
        
        else if (newPassword.equals("Java101")){
            System.out.println("It cannot be the same as your old password.");

        }
    
        else{
           System.out.println("New password created.");
        };
        
        */