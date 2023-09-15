
public class For3 {
    public static void main(String[] args) {
        //break and continue
        for (int i = 0; i < 10; i++) {
            System.out.println(" " + i);
            if (i==5)
                break;
        }
        System.out.println("Loop stopped");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(" " + i);
        }
        
    }
}
