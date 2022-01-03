package Assignment1;

//Task_8: Write a program to check balance and withdraw money from ATM booth using if else

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        double currentBalance = 1500;
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type '1' for check balance");
        System.out.println("Type '2' for withdraw money");

        input = sc.nextInt();

        if(input== 1){
            System.out.println("Available Balance is " +currentBalance);
        }
        else if(input==2){
            System.out.println("Enter amount:");
            int amount = sc.nextInt();
            System.out.println("Withdraw money successfully");
            double newCurrentBalance = currentBalance - amount;
            System.out.println("Available Balance is = " +newCurrentBalance);
        }
        else
        {
            System.out.println("Enter the correct number");
        }
    }
}
