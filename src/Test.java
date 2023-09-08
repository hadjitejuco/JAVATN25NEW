//https://github.com/hadjitejuco/JAVATN25NEW
public class Test {
    public static void main(String[] args) {
        //division
//        System.out.println(9/2);
//        System.out.println(9.0/2);
//        System.out.println(9/2.0);
//        System.out.println(9.0/2.0);
        
        //assignment operators
        // =
//        //create a variable
//        int x  = 4;
//        int y;
//        
//        //assign value using the =
//        y = x;
//        System.out.println("Value of y is "+y);
//        
//        //+=, -=, *=, /+, %=
//        y += x; // y = x + x
//        System.out.println("value using += "+y);
//        y *= x;
//        System.out.println("value using *= "+y);
        
          //logical operators
          /*
            AND && OR || NOT !
                            AND         OR          NOT
                            &&          ||          !
                            FAND        TOR
          t     t           t           t       t   f
          t     f           f           t       f   t
          f     t           f           t
          f     f           f           f
          */
          System.out.println((5>3)&&(8>5));
          System.out.println((5>3)&&(8<5));
          System.out.println((5<3)&&(8>5));
          System.out.println((5<3)&&(8<5));
          System.out.println((5>3)||(8>5));
          System.out.println((5>3)||(8<5));
          System.out.println((5<3)||(8>5));
          System.out.println((5<3)||(8<5));
          System.out.println(!(5==3));
          System.out.println(!(5>3));

    }
}
