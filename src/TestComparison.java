//https://github.com/hadjitejuco/JAVATN25NEW
public class TestComparison {
    public static void main(String[] args) {
        
        String string1 = "Hadji";
        String string2 = "Hadji";
        String string3 = "hadji";
        
        //compare the values
        //if (string1 == string2){   //use of == operator
        if (string1.equals(string2)) {   
            System.out.println("String 1 and String 2 are equal");
        }else{
            System.out.println("String 1 and String 2 is not equal ");
        } 
        if (string1.equals(string3)) {   
            System.out.println("String 1 and String 2 are equal");
        }else{
            System.out.println("String 1 and String 2 is not equal ");
        }
    }
}
