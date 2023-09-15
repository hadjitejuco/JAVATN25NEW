
public class Array2 {
    public static void main(String[] args) {
        //compute the sum
        int a[] = new int[5];
        //new -> instantiate (create) a new object of a class of array
        //new allocates and store the value to the heap
        //managing dynamic memory
        int sum = 0;
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        //System.out.println("Value of array[0] = "+a[0]);
        for (int i = 0; i < 5; i++) {
            sum = sum +i;
        }
        System.out.println("The sum is "+sum);
        ////////////////////////////////////////////
        sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum +i;
        }
        System.out.println("The sum is "+sum);
    }
}
