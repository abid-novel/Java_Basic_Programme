package Assignment1;

//Task_5: Write a program to calculate CGPA and find grade

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Enter English GPA:");
        Scanner sc = new Scanner(System.in);
        double English = sc.nextDouble();
        System.out.println("Enter Bangla GPA:");
        double Bangla = sc.nextDouble();
        System.out.println("Enter Math GPA:");
        double Math = sc.nextDouble();
        System.out.println("Enter Computer GPA:");
        double Computer = sc.nextDouble();

        double CGPA = (English + Bangla + Math + Computer)/4;
        System.out.println("Your CGPA is: " + CGPA);

        if(CGPA == 4.0) {
            System.out.println("Your Final Grade is A+");
        }
        else if(CGPA>=3.7 && CGPA<4.0) {
            System.out.println("Your Final Grade is A-");
        }
        else if(CGPA>=3.3 && CGPA<3.7) {
            System.out.println("Your Final Grade is B+");
        }
        else if(CGPA>=3.0 && CGPA<3.3) {
            System.out.println("Your Final Grade is B");
        }
        else if(CGPA>=2.7 && CGPA<3.0) {
            System.out.println("Your Final Grade is B-");
        }
        else if(CGPA>=2.3 && CGPA<2.7) {
            System.out.println("Your Final Grade is C+");
        }
        else if(CGPA>=2.0 && CGPA<2.3) {
            System.out.println("Your Final Grade is C");
        }
        else if(CGPA>=1.7 && CGPA<2.0) {
            System.out.println("Your Final Grade is C-");
        }
        else if(CGPA>=1.3 && CGPA<1.7) {
            System.out.println("Your Final Grade is D+");
        }
        else if(CGPA>=1.0 && CGPA<1.3) {
            System.out.println("Your Final Grade is D");
        }
        else
            System.out.println("Your Final Grade is F");
    }
}
