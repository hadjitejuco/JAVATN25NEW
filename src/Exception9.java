
public class Exception9 {
    static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("hahaha mali ka");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

    public static void main(String[] args) {
        checkAge(19); // Set age to 15 (which is below 18...)
    }
}
