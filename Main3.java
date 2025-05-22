public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    //setters

  public void setAccountNumber(int accountNumber){
    this. accountNumber= accountNumber;
  }

 public void setAccountHolder(String accountHolder){
    this.accountHolder=accountHolder;
  }

   public void setBalance(double balance){
    this.balance=balance;

    
    }
}

//method
public void displayAccounts(){
  System.out.println("Aaccount Number: "+ accountNumber + ",AccountHolder's Name: "+ accountHolder + ",Balance: "+ balance);
  } 


public class Bank {

}

public class Main3 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount(new BankAccount(1001, "Alice", 5000.0));
        bank.addAccount(new BankAccount(1002, "Bob", 3000.0));

        bank.withdrawFromAccount(1001, 6000.0); // Exception
        bank.withdrawFromAccount(1002, 1000.0); // Success

        bank.displayAccounts();
    }
}
