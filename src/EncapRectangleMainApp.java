
public class EncapRectangleMainApp {
    public static void main(String[] args) {
        EncapRectangle rectangle = new EncapRectangle(4,7);
        System.out.println("Value of width "+rectangle.getWidth());
        System.out.println("Value of height "+rectangle.getHeight());
        System.out.println("Area of rectangle is "+rectangle.area()); 
        
        rectangle.setWidth(5);
        rectangle.setHeight(5);
            
        System.out.println("New Value of width "+rectangle.getWidth());
        System.out.println("New Value of height "+rectangle.getHeight());
        System.out.println("Area of rectangle is "+rectangle.area());   
        
    }
}
