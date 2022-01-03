package Assignment2;

//Task_3: Write a program to make a digital tasbih where the program counts each time user press enter until press 0

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        String key;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Start the Digital Tasbih by Pressing the \"Enter\" Button -> ");

        while(true){
            key = input.nextLine();
            if (key.equals("")) {
                count++;
            }
            System.out.println("Number of Count = "+count);
            if (key.equals("0")) {
                break;
            }
        }

    }
}
