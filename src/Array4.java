
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = scanner.nextInt();
        
        //declare the array
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element "+ (i+1) + ":");
                numbers[i] = scanner.nextInt();
        }
        System.out.println("Entered Array");
        for (int number : numbers) {
            System.out.println(number);
        }
        scanner.close();   //avoiding resources leaks
    }
}
