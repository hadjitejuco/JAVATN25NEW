
import java.util.Scanner;
public class EncapBankAccountMainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the account holders name: ");
        String name = scanner.nextLine();
        System.out.println("Enter initial bank balance: ");
        double initialBalance = scanner.nextDouble();
       
        EncapBankAccount account = new EncapBankAccount(name,initialBalance);
        
        while (true) {
            System.out.println("\n===-Menu-===");
            System.out.println("1. Add Transaction"); //+number deposit  -number withdrawal
            System.out.println("2. Display Transaction");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter Amount");
                    double amount = scanner.nextDouble();
                    account.addTransaction(amount);
                    break;
                case 2:
                    System.out.println("Transaction for "+ name + ":");
                    int index = 0;
                    for(double transaction :account.getTransactions()){
                        System.out.println(index++ + ". "+ transaction);
                    }
                        
                    break;
                case 3:
                    System.out.println("Current Balance " +account.getCurrentBalance());
                    break;
                case 4:
                    System.out.println("Exit");
                    scanner.close();
                    return;
                default:
                    System.out.println("invalid choice, try again");
            
            }
 
        }
    }
 
}
