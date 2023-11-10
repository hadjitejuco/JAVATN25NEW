
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class CreateAndWriteFileExample {
    public static void main(String[] args) {
        
        try {
            //specify the location and filename 
            File myFile = new File ("/Users/hadjitejuco/NetBeansProjects/TN25/src/sample.txt");
            //File myFile = new File ("C:\\USERS\\DESKTOP\\ABC\\sample.txt"); for windows kayo n bahala
            
            //Write to the file
            FileWriter writer = new FileWriter(myFile, true);
            
            writer.write('C');
            
            //close write
            writer.close();
            
            System.out.println("Successfully wrote to the file...");
            
        }catch(IOException e) {
            System.err.println("Error occured");
            //e.printStackTrace();
        
        }
        
        
        
        
        
        
    }
    

}
