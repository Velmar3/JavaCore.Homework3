package Homework3;

public class Manager extends Employee {

    public Manager(String firstName, String latName, String jobTitle, String phone, int salary, int age) {
        super(firstName, latName, jobTitle, phone, salary, age);
    }

    public static void salaryUp(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getJobTitle() != "Руководитель") {
                employees[i].setSalary(employees[i].getSalary() + 2500);
            }
        }
    }
}
