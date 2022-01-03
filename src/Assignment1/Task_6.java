package Assignment1;

//Task_6: Write a program to check if the provided user credentials are valid during login

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        String _username = "Novel";
        String _password = "123456";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Username: ");
        String username = input.next();
        System.out.println("Enter Your Password: ");
        String password = input.next();

        if(username.equals(_username) && password.equals(_password)) {
            System.out.println("Access Granted");
        }

        else
            System.out.println("Access Denied");
    }
}
