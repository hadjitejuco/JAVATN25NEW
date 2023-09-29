
public class InheritParentChild3MainApp {
    public static void main(String[] args) {
        InheritChild3 child = new InheritChild3();
        
        child.display(10);//parent class
        child.display(20, 30); //parent class
        child.display("Hello"); // child
        child.display(3.14); //child
        
    }
}
