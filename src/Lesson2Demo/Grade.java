package Lesson2Demo;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        grade = sc.nextInt();

        if((grade<=100) && (grade>=95)){
            System.out.println("Excellent");
        }
        else if((grade <=94) && (grade >=90)){
            System.out.println("Satisfactory");
        }
        else if((grade <=89) && (grade>=85)){
            System.out.println("Very Good");
        }
        else if((grade<=84) &&(grade>=80)){
            System.out.println("Good");
        }
        else if((grade<=79) && (grade>=75)){
            System.out.println("Passed");
        }
        else if((grade<=74) && (grade>=65)) {
            System.out.println("Failed");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
