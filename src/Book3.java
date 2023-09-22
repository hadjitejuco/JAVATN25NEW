
public class Book3 {
    //constructor executes when the program runs
    //same name as the class
    
    //attributes or variable
    String title;
    String name;
    double price;
    
    //Constructor
    Book3(String t, String n, double p){
        title = t;
        name = n;
        price = p;
    }
    
    void displayInfo(){
        System.out.println("Title of Book: "+title);
        System.out.println("Author of Book: "+name);
        System.out.println("Price of Book: "+price);
    }
    
}
