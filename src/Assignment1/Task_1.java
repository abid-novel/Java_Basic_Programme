package Assignment1;

//Task_1: Write a program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a Number:");
        double number = input.nextDouble();

        if(number>=0) {
            System.out.println("It is a positive number");
        }

        else {
            System.out.println("It is a negative number");
        }

    }
}
