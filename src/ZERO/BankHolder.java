package ZERO;

public class BankHolder {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankHolder(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    protected void depositAmount(double b){
        if(b<0){
            System.out.println("can't add negative to the balance");
        } else {
         this.balance += b;
        }
    }

    protected void withdraw(double w){
        if(w<0){
            System.out.println("can't add negative to the balance");
        } else {
            this.balance -= w;
        }
    }

    protected String getAccountInfo(){
        return "The name of the account holder is " + this.accountHolderName + ", \nthe account number is "+  this.accountNumber +". \nThe total available balance in the account is: " +this.balance;
    }

    protected double getBalance(){
        return this.balance;
    }
}
