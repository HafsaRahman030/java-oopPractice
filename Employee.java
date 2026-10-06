public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String department;

    // Constructor
    public Employee() {
        salary = 0;
        System.out.println("This is an employee with salary: " + getSalary());
    }

    // Constructor Salary
    public Employee(double salary) {
        this.salary = salary;
        System.out.println("This is an employee with salary: " + getSalary());
    }

    //constructor
    public Employee(int employeeId, String name, double salary, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    //setter getter method

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
        else {
            System.out.println("Salary can't be negative");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    //display method
    public void display() {
        System.out.println("The employee information:");
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDepartment());
    }
}
