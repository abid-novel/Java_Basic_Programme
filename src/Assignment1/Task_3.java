package Assignment1;

//Task_3: Write a program that takes a year from user and print whether that year is a leap year or not

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year :  ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
