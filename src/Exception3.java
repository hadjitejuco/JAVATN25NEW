
public class Exception3 {
    public static void main(String[] args) {
        int d, a;
        try {
            d =  0;
            a = 10/d;
            
            System.out.println(a);
            System.out.println("This will not be printed");
        
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero, Arithmetic Exception"+e);
        }
        System.out.println("Print after the catch statement");
    }
}
