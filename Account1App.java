import java.util.Scanner;

public class Account1App {
    public static void main(String[] args) {

        //setter method
        Account1 a1 = new Account1();
        a1.setNumber(101);
        a1.setAccountHolder("A");
        a1.setBalance(10000.500);
        a1.setType("Current");

        //display method
        a1.display();

        //constructors
        Account1 a2= new Account1();
        Account1 a3 = new Account1(5000.0);
        Account1 a4 = new Account1(103); 
        Account1 a5 = new Account1("C", "Current");

        //user input
        Scanner input = new Scanner(System.in);
        
        Account1 a6 = new Account1();
        System.out.print("Enter account number: ");
        a6.setNumber(input.nextInt());
        input.nextLine();
        System.out.print("Enter account holder: ");
        a6.setAccountHolder(input.nextLine());
        System.out.print("Enter balance: ");
        a6.setBalance(input.nextDouble());
        input.nextLine();
        System.out.print("Enter account type: ");
        a6.setType(input.nextLine());
       
        a6.display();
  

    }
}
