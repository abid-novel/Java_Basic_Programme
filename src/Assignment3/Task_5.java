package Assignment3;

//Task_5: Find the number of notes from input amount in given array [1000,500,100,50,20,10,5,2,1]

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();

        while (amount>0){
            if (amount>=1000){
                System.out.println("NO. of 1000 notes: " +amount/1000);
                amount = amount % 1000;
            }
            else if (amount>=500){
                System.out.println("NO. of 500 notes: "+amount/500);
                amount = amount % 500;
            }
            else if (amount>=100){
                System.out.println("NO. of 100 notes: "+amount/100);
                amount = amount % 100;
            }
            else if (amount>=50){
                System.out.println("NO. of 50 notes: "+amount/50);
                amount = amount % 50;
            }
            else if (amount>=20){
                System.out.println("NO. of 20 notes: "+amount/20);
                amount = amount % 20;
            }
            else if (amount>=10){
                System.out.println("NO. of 10 notes: "+amount/10);
                amount = amount % 10;
            }
            else if (amount>=5){
                System.out.println("NO. of 5 notes: "+amount/5);
                amount = amount % 5;
            }
            else if (amount>=2){
                System.out.println("NO. of 2 notes: "+amount/2);
                amount = amount % 2;
            }
            else if (amount>=1){
                System.out.println("NO. of 1 notes: "+amount/1);
                amount = amount % 1;
            }
        }
    }
}
