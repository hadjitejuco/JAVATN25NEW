
public class EncapCircleMainApp {
    public static void main(String[] args) {
        EncapCircle circle = new EncapCircle(5);
        System.out.println("The value of radius is "+circle.getRadius());
        System.out.println("The area of the circle is: "+circle.area());
        circle.setRadius(10);
        System.out.println("The value of radius is "+circle.getRadius());
        System.out.println("The area of the circle is: "+circle.area());
    }
}
