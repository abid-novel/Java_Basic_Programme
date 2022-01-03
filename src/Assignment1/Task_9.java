package Assignment1;

//Task_8: Write a program to check balance and withdraw money from ATM booth using switch case

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        double currentBalance = 5000;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("Enter any option:");
        choice = sc.nextInt();

        switch(choice){

            case 1:
                System.out.println("Your Current Balance is = " +currentBalance);
                break;

            case 2:
                double amount;
                System.out.println("Enter Amount: ");
                amount = sc.nextDouble();
                System.out.println("You have withdrawn " +amount);
                double newCurrentBalance = currentBalance - amount;
                System.out.println("Available Balance is = " +newCurrentBalance);
                break;

            default:
                System.out.println("Please enter the correct option");
        }
    }
}
