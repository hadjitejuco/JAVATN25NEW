import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n=== Banking System Menu ===");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Print Transactions");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Account ID: ");
                    String accountId = scanner.next();
                    System.out.print("Enter Name: ");
                    String accountName = scanner.next();
                    account = new BankAccount(accountId, accountName, 0);
                    FileUtility.writeToFile("Account Created: " + account.getAccountDetails());
                    break;
                case 2:
                    if (account == null) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    FileUtility.writeToFile("Deposited $" + depositAmount + ": " + account.getAccountDetails());
                    break;
                case 3:
                    if (account == null) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        FileUtility.writeToFile("Withdrawn $" + withdrawAmount + ": " + account.getAccountDetails());
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    if (account == null) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 5:
                    FileUtility.readFromFile();
                    break;
                case 6:
                    System.out.println("Exiting Banking System...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
