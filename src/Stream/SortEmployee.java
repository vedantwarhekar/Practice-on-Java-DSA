package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id, String name, String dept, double salary){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public  double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + dept + " " + salary;
    }
}

public class SortEmployee{
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(1, "Amit", "IT", 60000),
                new Employee(2, "Neha", "HR", 45000),
                new Employee(3, "Raj", "IT", 80000),
                new Employee(4, "Pooja", "Finance", 70000)
        );

        List<Employee> sortedEmp = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee :: getSalary).reversed())
                .collect(Collectors.toList());

        sortedEmp.forEach(System.out::println);
    }
}