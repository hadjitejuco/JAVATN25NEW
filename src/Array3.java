
public class Array3 {
    public static void main(String[] args) {
        double [] numbers = {1.1,2.2,3.3,4.4,5.5};
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        //average
        double average = sum / numbers.length;   // sum / 5
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+average);
    }
}
