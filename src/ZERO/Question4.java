package ZERO;

public class Question4 {
    public static void main(String[] args) {
        BankHolder holder1 = new BankHolder("00000001", "Abhay Singh", 50000);
        BankHolder holder2 = new BankHolder("00000002", "Super Robot", 99999);

        holder1.depositAmount(500);
        System.out.println(holder1.getBalance());
        holder1.withdraw(400);
        System.out.println(holder1.getBalance());
        System.out.println(holder1.getAccountInfo());


        System.out.println(" ");
        holder2.depositAmount(0);
        System.out.println(holder2.getBalance());
        holder2.withdraw(9999);
        System.out.println(holder2.getBalance());
        System.out.println(holder2.getAccountInfo());
    }
}
