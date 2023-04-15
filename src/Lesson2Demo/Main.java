package Lesson2Demo;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int studentNumber;
        String studentName;
        String course;

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Student Number: ");
            studentNumber = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter the Student Name: ");
            studentName = sc.nextLine();

            System.out.println("Enter the Student Course: ");
            course = sc.nextLine();

            Student myStudent = new Student();

            myStudent.setStudentNumber(studentNumber);
            myStudent.setStudentName(studentName);
            System.out.println(myStudent.getStudentNumber() +"\t"+ myStudent.getStudentName());
            System.out.println(myStudent.enrol(course));
            System.out.println(myStudent.drop(course));

            Student studentBulakbol = new Student();
            studentBulakbol.setStudentNumber(223);
            studentBulakbol.setStudentName("Jimmy");
            System.out.println(myStudent.getStudentNumber() +"\t"+ myStudent.getStudentName());
            System.out.println(myStudent.enrol("BSIT2"));
            System.out.println(myStudent.drop("OOP"));


    }
}
