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
