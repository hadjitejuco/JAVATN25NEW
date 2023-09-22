
public class Counter {
    static int count = 0;
    
    Counter(){
        count++;        //1+1+1 = 3
    }
    
    static void displayCount(){
        System.out.println("total count: "+count);
    }
}
