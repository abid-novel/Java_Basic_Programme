package Assignment2;

//Task_5: Create a math quiz program
//Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers. If user inputs the correct summation, print "Answer is correct" and user will get 1 point. if user inputs wrong summation,  then user will get 0 point. Finally after 5 iteration, total score will be shown

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        int score = 0;
        int userInputSum;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=4; i++){
            double randomNumber1 = Math.ceil(Math.random()*10);
            System.out.println("Random Number 1 is: "+randomNumber1);
            double randomNumber2 = Math.ceil(Math.random()*20);
            System.out.println("Random Number 2 is: "+randomNumber2);
            double sumOfRandomNumbers = randomNumber1 + randomNumber2;

            System.out.println("Enter the sum of random numbers: ");
            userInputSum = sc.nextInt();
            if(userInputSum==sumOfRandomNumbers){
                System.out.println("Your answer is correct");
                score++;
            }

            else{
                System.out.println("Your answer is wrong");
                score--;
            }


        }

        System.out.println("Your Total Score is: "+score);


    }
}
