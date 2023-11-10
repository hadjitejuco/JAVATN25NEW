
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


public class CreateAndWriteFileFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("please enter a character: ");
            char userChar = scanner.nextLine().charAt(0);
            //specify the location and filename 
            File myFile = new File ("/Users/hadjitejuco/NetBeansProjects/TN25/src/sample.txt");
            
            //Write to the file
            FileWriter writer = new FileWriter(myFile, true);
            
            writer.write(userChar);
            
            //close write
            writer.close();
            
            System.out.println("Successfully written to the file...");
            
        }catch(IOException e) {
            System.err.println("Error occured");
            //e.printStackTrace();
        
        }finally {
            scanner.close();
        
        }

    }
    
}
