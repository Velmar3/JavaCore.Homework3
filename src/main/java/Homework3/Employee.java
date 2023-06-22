package Homework3;

public class Employee {
    private String firstName;
    private String latName;
    private String jobTitle;
    private String phone;
    private int salary;
    private int age;

    public Employee(String firstName, String latName, String jobTitle, String phone, int salary, int age) {
        this.firstName = firstName;
        this.latName = latName;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee " +
                "firstName: " + firstName +
                ", latName: " + latName +
                ", jobTitle: " + jobTitle +
                ", phone: " + phone +
                ", salary: " + salary +
                ", age: " + age;
    }
}
