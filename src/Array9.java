
public class Array9 {
    //compute for the sum of our 2 dim array
      public static void main(String[] args) {
        //array with default values
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //print the content of the two dim array
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " " );
                sum += matrix[i][j];
            }
            System.out.println();
        }
          System.out.println("The sum is "+ sum);
    }
}
