import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {

        // setter method
        Employee e1 = new Employee();
        e1.setEmployeeId(101);
        e1.setName("A");
        e1.setSalary(8550.50);
        e1.setDepartment("SWE");

        // display method
        e1.display();

        // constructors
        Employee e2 = new Employee();
        Employee e3 = new Employee(6000.0);
        Employee e5 = new Employee(102, "B", 80500, "Software Architecture");
        Employee e6 = new Employee(103, "D", 9000, "CSE Engineering");

        e5.display();
        e6.display();

        // user input
        Scanner input = new Scanner(System.in);

        Employee e7 = new Employee();

        System.out.print("Enter employee ID: ");
        e7.setEmployeeId(input.nextInt());

        input.nextLine();

        System.out.print("Enter name: ");
        e7.setName(input.nextLine());

        System.out.print("Enter salary: ");
        e7.setSalary(input.nextDouble());

        input.nextLine();

        System.out.print("Enter department: ");
        e7.setDepartment(input.nextLine());

        e7.display();
    }
}
