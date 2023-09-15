

import java.util.Scanner;
public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the size of the array ");
        int size = scanner.nextInt();
        
        //declare the array
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element "+ (i+1) + ":");
                numbers[i] = scanner.nextInt();
        }
        
        //check if the number is existing in the array list
        System.out.println("Enter number to check ");
        int check = scanner.nextInt();
        boolean isPresent = false;
        for (int number : numbers){
            if (number == check){
                isPresent = true;
                break;
            }
        }
        System.out.println("Is "+ check + " present in the array?" + isPresent);
        scanner.close();
    }
}
