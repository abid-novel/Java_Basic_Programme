package Assignment2;

//Task_2: Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int startingPoint = 2, endingPoint, flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last range: ");
        endingPoint = sc.nextInt();
        System.out.println("Prime numbers between " + startingPoint + " and " + endingPoint + " are : ");
        while (startingPoint < endingPoint) {
            flag = 0;
            for (int i = 2; i <= startingPoint / 2; i++) {
                if (startingPoint % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(startingPoint + " ");
                ++startingPoint;
        }
    }
}