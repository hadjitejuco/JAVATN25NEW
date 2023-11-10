
//create a file
//import java.io.*;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        
        try {
            //specify the location and filename 
            ///Users/hadjitejuco/NetBeansProjects/TN25/src  (MAC)
            //windows -> c:\\users\\desktop\\abc\\sample.txt
            
            File myFile = new File ("/Users/hadjitejuco/NetBeansProjects/TN25/src/sample.txt");
            //File myFile = new File ("C:\\USERS\\DESKTOP\\ABC\\sample.txt");
            
            //create file 
            if (myFile.createNewFile()){
                System.out.println("File created "+myFile.getName());
            }else {
                System.out.println("File Already exist....");
            }
            
        }catch(IOException e) {
            System.err.println("Error occured");
            e.printStackTrace();
        
        }
        
        
        
    }
}
