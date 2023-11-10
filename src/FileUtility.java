
/*
LEC
Answer FA 4-5
Nov 15 - SA3
Mov 17 - SA4

LAB

Upload PDF / java program
FA5 - 
    Prepare MENU
        list
        Queue
        Set
SA4
    NOV 25
FINAL PROJECT 
    Create a Game that uses all the java topics 
        Collections
        Filehandling

        TEMPLATE
            Introduction
            Rules
            Discussion
            SS
        Video Presentation -> Nov 24, 2023 (ONLINE) ->

        Upload  
            TEMPLATE . -> CANVAS 
            java file -> CANVAS
            Video GDRIVE with TEMPLATE and' JAVA FILE





*/








import java.io.*;

public class FileUtility {
    private static final String FILE_NAME = "/Users/hadjitejuco/NetBeansProjects/TN25/src/bank_accounts.txt";

    // Write to file
    public static void writeToFile(String content) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
        }
    }

    // Read from file
    public static void readFromFile() {
        try (FileReader fr = new FileReader(FILE_NAME);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
        }
    }
}
