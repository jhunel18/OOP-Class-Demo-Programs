package Lessson3Demo;
import java.util.Scanner;
public class TestEmployee {
    public static void main(String[] args) {
        String empName;
        int empHours;
        double empRate;
        double tax;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name; ");
        empName = sc.nextLine();
        System.out.println("Enter your Hours Worked ");
        empHours = sc.nextInt();
        System.out.println("Enter your rate per hour: ");
        empRate = sc.nextDouble();
        System.out.println("Enter your tax ");
        tax = sc.nextDouble();

        Employee emp1 = new Employee();
        emp1.setEmployeeName(empName);
        emp1.setEmployeeHour(empHours);
        emp1.setEmployeeRate(empRate);
        emp1.setEmployeeTax(tax);

        System.out.println(emp1.computeEmployeeSalary());
        System.out.println(emp1.computeEmployeeTax());
        System.out.println(emp1.takeHomePay());

    }
}
