
public class BankAccount {
    
    private double balance;
    
    //getters for balance
    public double getBalance(){
        return balance;
    }
    //setters
    //input / modification
    private void setBalance(double balance){
        this.balance = balance;
    }
    
    //deposit method
    public void deposit(double amount){
        if (amount > 0) {
            setBalance(getBalance()+amount);
        }
    }
    
    public void withdraw(double amount){
        if (amount > 0 && amount <= getBalance()){
            setBalance(getBalance()-amount);
        }else{
            System.out.println("Invalid below or exceed ");
        }
    }
    
}
