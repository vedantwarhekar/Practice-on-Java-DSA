package DesignPattern.AbstractFactoryDesignOrFactoryMethodDp;

public class Main
{
    public static void main(String[] args) {
        Employee el = EmployeeFactory.getEmployee(new AndroidDevFactory());
        el.name();

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        e2.name();
    }
}
