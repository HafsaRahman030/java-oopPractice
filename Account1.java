public class Account1 {
    private int number;
    private String accountHolder;
    private double balance;
    private String type;

    public Account1 (){
    balance=0;
    System.out.println("This is an account with banalce:" +getBalance());
}

public Account1 (double balance){
    this.balance=balance;
    System.out.println("This is an account with banalce:" +getBalance());
}

public Account1 (int number){
    this.number=number;
    System.out.println("Account number is :" +getNumber());
}

public Account1 (String accountHolder,String type){
    this.accountHolder = accountHolder;
    this.type=type;
    System.out.println("Account holder is:" +getAccountHolder());
    System.out.println("This is an account:" +getType());
 
}

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}  //end of class
