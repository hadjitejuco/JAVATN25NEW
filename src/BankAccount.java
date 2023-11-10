
public class BankAccount {
    
//    private double balance;
//    
//    //getters for balance
//    public double getBalance(){
//        return balance;
//    }
//    //setters
//    //input / modification
//    private void setBalance(double balance){
//        this.balance = balance;
//    }
//    
//    //deposit method
//    public void deposit(double amount){
//        if (amount > 0) {
//            setBalance(getBalance()+amount);
//        }
//    }
//    
//    public void withdraw(double amount){
//        if (amount > 0 && amount <= getBalance()){
//            setBalance(getBalance()-amount);
//        }else{
//            System.out.println("Invalid below or exceed ");
//        }
//    }
    
    
    
    //this is for file handling codes
    
    
    private String accountId;
    private String accountName;
    private double balance;

    public BankAccount(String accountId, String accountName, double initialBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Get account details
    public String getAccountDetails() {
        return "Account ID: " + accountId + ", Name: " + accountName + ", Balance: $" + balance;
    }
    
    
    
    
    
    
    
}
