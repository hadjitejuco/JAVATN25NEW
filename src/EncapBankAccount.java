
public class EncapBankAccount {
    //private var
    private String accountHolder;
    private double[] transactions;
    
    
    //constructor
    public EncapBankAccount (String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        this.transactions = new double[]{initialBalance};
    }
    
    public void addTransaction(double amount){
        double[] newTransactions = new double[transactions.length+1];
        System.arraycopy(transactions, 0, newTransactions, 0,transactions.length);
        newTransactions[transactions.length] = amount;
        transactions = newTransactions;
    
    }
    
    public double getCurrentBalance(){
        double balance = 0;
        for(double transaction : transactions){
            balance += transaction;
        }
        return balance;
    }
    
    public double[] getTransactions() {
        return transactions.clone();
    }
    
}
