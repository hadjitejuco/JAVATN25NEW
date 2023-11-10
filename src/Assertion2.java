
public class Assertion2 {
    public static void main(String[] args) {
        int num = -1;
        checkPositive(num);
    }

    public static void checkPositive(int num) {
        assert num > 0 : "Number is not positive!";
        System.out.println("Number is positive.");
    }
}
