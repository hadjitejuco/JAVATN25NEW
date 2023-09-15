//static array
//initialized and print the contents of the array
public class Array1 {
    public static void main(String[] args) {
                   //    0 1 2 3 4
        int[] numbers = {1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            System.out.println("The value of array is "+numbers[i]);
        }
        System.out.println("==================");
        for (int number : numbers) {
             System.out.println("The value of array is "+number);
        }
    }
}
