
import java.util.Scanner;
public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
      
        System.out.println("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        
        System.out.println("Current Balance is: "+account.getBalance());
        
        System.out.println("Enter amount to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);
        
        System.out.println("Updated Balance is "+account.getBalance());
    
    }
    
    
    
    
    
   
}
