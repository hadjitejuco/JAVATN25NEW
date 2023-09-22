
import java.util.Scanner;
public class PersonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        
        //create instance of the class Person
        Person person = new Person(name,age);
        
        System.out.println("Your name is: "+person.getName());
        System.out.println("Your age is "+person.getAge());
        
        //update the values for name and age
        //setters
        System.out.println("------------------------");
        System.out.println("Update information");
        scanner.nextLine(); 
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        person.setName(newName);
        System.out.println("Enter new age: ");
        int newAge = scanner.nextInt();
        person.setAge(newAge);
        
        System.out.println("------------------------");
        System.out.println("Your name is: "+person.getName());
        System.out.println("Your age is "+person.getAge());
        
        
        
        scanner.close();
        
    }
}
