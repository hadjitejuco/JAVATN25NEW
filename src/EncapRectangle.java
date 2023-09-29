

public class EncapRectangle {
    private double width;
    private double height;
    
    
    //constructor
    public EncapRectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
    
    //accessors -> getters
    public double getWidth(){
        return width;
    }
    //accessor -> getters
    public double getHeight(){
        return height;
    }
    
    //mutators -> setters
    public void setWidth (double width){
         this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
    public double area(){
        return width * height;
    }
    
    
}
