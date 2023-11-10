

//system.err (standard error stream)

import java.util.Scanner;

public class ErrorExample {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered "+number);
        
        }catch(Exception e) {
            System.err.println("Error: Invalid Input");
        
        }finally {
        
        }
        
    }
}
