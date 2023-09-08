import java.util.Scanner;
public class If6 {
    public static void main(String[] args) {
        //https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output#:~:text=The%20Java%20printf%20function%20helps,that%20might%20trigger%20output%20errors.
        /*
        create a program that will compute for the commission of a salesman
        according to the given rates. Input will be sales of the salesman 
        
        Sales Value         Commission rate
        0 - 5000            0%
        5001 - 10000        5%
        10001 - 20000       10%
        20001 - 30000       12%
        above 30000         15%
        */
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the sales value of the salesman: ");
        double sales = scanner.nextDouble();

        double commissionRate;
        if (sales >= 0 && sales <= 5000) {
            commissionRate = 0.0;
        } else if (sales > 5000 && sales <= 10000) {
            commissionRate = 0.05;
        } else if (sales > 10000 && sales <= 20000) {
            commissionRate = 0.10;
        } else if (sales > 20000 && sales <= 30000) {
            commissionRate = 0.12;
        } else {
            commissionRate = 0.15;
        }

        double commission = sales * commissionRate;

        System.out.printf("The commission for sales of %.2f is %.2f%n", sales, commission);
        
        
        
        
    }
}
