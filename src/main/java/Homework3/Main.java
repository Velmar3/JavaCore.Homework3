package Homework3;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Дмитрий", "Соколовский", "Уборщик", "+7617231122", 6000, 61);
        Employee employee2 = new Employee("Виктор", "Макаренко", "Администратор", "+7612239122", 10000, 37);
        Employee employee3 = new Employee("Степан", "Петровский", "Охранник ", "+7613239122", 8000, 29);
        Employee employee4 = new Employee("Ольга", "Виршич", "Бухгалтер", "+7617439122", 10000, 55);
        Employee employee5 = new Employee("Виктория", "Петрашевич", "Дворник", "+7657239122", 6000, 45);
        Manager manager1 = new Manager("Евгения", "Степаненко", "Руководитель", "+7616239122", 15000, 41);
        Manager manager2 = new Manager("Олег", "Ивановский", "Руководитель", "+7216239122", 18000, 49);

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5, manager1, manager2};

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Manager.salaryUp(employees);
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
