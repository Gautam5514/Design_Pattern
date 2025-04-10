package factory_Method;

public class DeveloperClient {

    public static void main(String[] args) {
        // Employee types
        String empType = "Web Developer";
        String empType2 = "Android Developer";

        // Get and display Web Developer details
        Employee employee = EmployeeFactory.getEmployee(empType);
        if (employee != null) {
            int salary = employee.salary();
            System.out.println(empType + " Salary: " + salary);
        } else {
            System.out.println("Failed to get employee object for " + empType);
        }

        // Get and display Android Developer details
        Employee employee2 = EmployeeFactory.getEmployee(empType2);
        if (employee2 != null) {
            int salary2 = employee2.salary();
            System.out.println(empType2 + " Salary: " + salary2);
        } else {
            System.out.println("Failed to get employee object for " + empType2);
        }
    }
}
