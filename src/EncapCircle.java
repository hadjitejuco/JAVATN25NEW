//Encapsulation
//compute for the area of circle
//area = pi * r2
public class EncapCircle {
    //set private var
    private double radius;
    
    //constructor
    public EncapCircle(double radius){
        this.radius = radius;
    }
    
    //get radius
    public double getRadius(){
        return radius;
    }
    
    //set a value to our radius
    public void setRadius(double radius){
        if (radius > 0){
             this.radius = radius;
        }else{
            System.out.println("Invalid input raduis cannot be negative or zero");
        }
    }
    
    //compute for the radius
    public double area(){
        return Math.PI * radius * radius;
    }
    
}
