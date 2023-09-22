
public class Book2 {
    public static void main(String[] args) {
        //create an instance of the class book
        Book book1 = new Book();    //book1 -> object
        Book book2 = new Book();    //object
        
        book1.title = "Introduction to Java Programming";
        book1.author = "Hadji Tejuco";
        book1.price = 200.0;
        
        book2.title = "Introduction to Java Python";
        book2.author = "Hadji Javier";
        book2.price = 100.0;
        
        book1.displayInfo();
        book2.displayInfo();
    }
    
}
