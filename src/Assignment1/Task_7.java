package Assignment1;

//Task_7: Write a program to sum of random numbers

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        double randomNumber_1 = Math.ceil(Math.random()*10);
        System.out.println("First Random Number is = " +randomNumber_1);
        double randomNumber_2 = Math.ceil(Math.random()*10);
        System.out.println("Second Random Number is = " +randomNumber_2);

        double sumOfRandomNumbers = randomNumber_1 + randomNumber_2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Sum: ");
        double userInputSum  = input.nextDouble();

        if(sumOfRandomNumbers == userInputSum) {
            System.out.println("Your Answer is Correct");
        }
        else
            System.out.println("Your Answer is Wrong");
    }
}
