
//https://github.com/hadjitejuco/JAVATN25NEW/tree/master/src

public class Exceptiom8 {
     public static void main(String[] args) {
        try {
            int num = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        } finally {
            System.out.println("This will always be executed.");
        }
    }
   
}
