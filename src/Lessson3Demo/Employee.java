package Lessson3Demo;

public class Employee {
    private String employeeName;
    private int employeeHour;
    private double employeeRate;
    private double employeeTax;


    //setter
    public void setEmployeeTax(double empTax){
        employeeTax = empTax;
    }
    public void setEmployeeName(String empName){
        employeeName = empName;
    }
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeHour(int empHour){
        employeeHour = empHour;
    }
    public int getEmployeeHour(){
        return employeeHour;
    }

    public void setEmployeeRate(double empRate){
        employeeRate = empRate;
    }
    public double getEmployeeRate(){
        return employeeRate;
    }

    public double computeEmployeeSalary(){
        return employeeHour * employeeRate;
    }

    public double computeEmployeeTax(){

        return computeEmployeeSalary() * employeeTax;
    }
    public double takeHomePay(){
        return computeEmployeeSalary()- computeEmployeeTax();
    }


}
