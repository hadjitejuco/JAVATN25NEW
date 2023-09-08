

public class If4 {
    public static void main(String[] args) {
        /*
        if else if else statement
        if (condition1){
            executed 
        }else if (condition2){
            executed
        }else if (condition...n){
            executed (n)
        }else{
            executed
        }
        */
        // number positive > 0, negative < 0, 0 then is 0
        int x = 0;
        if (x > 0){
            System.out.println("Number is positive");
        }else if (x < 0) {
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }
}
