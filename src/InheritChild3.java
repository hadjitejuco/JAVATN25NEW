
public class InheritChild3 extends InheritParent3{
    @Override
    void display(String msg){
        System.out.println("Display message "+msg);
    }
    
    void display(double a){
        System.out.println("Displaying the value of a = "+a);
    }
    
}
