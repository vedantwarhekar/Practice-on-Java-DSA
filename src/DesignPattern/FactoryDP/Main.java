package DesignPattern.FactoryDP;

public class Main {
    public static void main(String[] args) {
        Employee emp =  EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(emp);
        int salary = emp.salary();
        System.out.println("Salary:- "+salary);

        Employee emp2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salary2 = emp2.salary();
        System.out.println("Salary:- "+salary2);

    }
}
