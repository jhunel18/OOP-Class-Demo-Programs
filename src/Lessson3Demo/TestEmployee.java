package Lessson3Demo;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmployeeName("Mark");
        emp1.setEmployeeHour(20);
        emp1.setEmployeeRate(19.10);
        emp1.setEmployeeTax(.10);
        System.out.println(emp1.computeEmployeeSalary());
        System.out.println(emp1.computeEmployeeTax());
        System.out.println(emp1.takeHomePay());

    }
}
