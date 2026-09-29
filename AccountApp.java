public class AccountApp
{
        public static void main(String[] args)
        {
           Account a1=new Account();
           Account a2=new Account();
           
        a1.setNumber(101);
        a1.setAccountHolder("A");
        a1.setBalance(10000.500);
        a1.setType("Current");

        System.out.println(a1.getNumber());
        System.out.println(a1.getAccountHolder());
        System.out.println(a1.getBalance());
        System.out.println(a1.getType());

        a2.setNumber(102);
        a2.setAccountHolder("B");
        a2.setBalance(105000.250);
        a2.setType("Current");

        System.out.println(a2.getNumber());
        System.out.println(a2.getAccountHolder());
        System.out.println(a2.getBalance());
        System.out.println(a2.getType());
        }
}