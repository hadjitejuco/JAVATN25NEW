
//import java.io.*;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

///Users/hadjitejuco/NetBeansProjects/TN25/src/sample.txt

public class ReadFileExample {
    public static void main(String[] args) {
        
        String fileName  ="/Users/hadjitejuco/NetBeansProjects/TN25/src/sample.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            
        }catch(IOException e) {
            System.err.println("Error occured");
            //e.printStackTrace();
        
        }

    }
}
