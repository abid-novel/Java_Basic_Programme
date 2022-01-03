package Assignment1;

//Task_2: Take three numbers from the user and print the greatest number

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number_1:");
        double number_1 = input.nextDouble();
        System.out.println("Input Number_2:");
        double number_2 = input.nextDouble();
        System.out.println("Input Number_3:");
        double number_3 = input.nextDouble();

        if(number_1>number_2 && number_1>number_3) {
            System.out.println(number_1+" is greatest");
        }

        else if(number_2>number_3 && number_2>number_1){
            System.out.println(number_2+" is greatest");
        }

        else
            System.out.println(number_3+" is greatest");

    }
}
