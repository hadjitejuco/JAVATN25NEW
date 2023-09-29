
public class InheritChild extends InheritParent{
    void display(){
        System.out.println("Display method FROM child class.....");
    }
    
    void show(){
        display();
        super.display();
    }
}
