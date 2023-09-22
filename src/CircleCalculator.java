//https://github.com/hadjitejuco/JAVATN25NEW
//functions - methods
import java.util.Scanner;
public class CircleCalculator {
    //constant var PI
    public static final double PI = 3.14159;
    
    //calculate the area            pi*r*r
    public static double calculateArea(double radius){
        return PI * radius * radius;
    }
     //calculate the circumference   2*pi*r
    public static double calculateCircumference(double radius){
        return 2 * PI * radius;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        
        //methods for calculating the area and circumference
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);
        
        System.out.println("Radius is: "+radius);
        System.out.println("Area of Circle: "+area);
        System.out.println("Circumference :" +circumference);
        
        scanner.close();
    }
    
    
}
