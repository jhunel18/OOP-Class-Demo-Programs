package Lessson3Demo;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentNumber(123);
        System.out.println(s1.getStudentNumber());

        s1.setName("AC");
        System.out.println(s1.getName());
    }
}
