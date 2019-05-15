package Projekt;

import java.io.*;
public class MusicTool {
    public static void main(String[] args) {
        Hashtable hash = new Hashtable(50); // abundance of space -> ex: ultimately 30 songs with space 50

        // The name of the file to open.
        String fileName = "C:\\Users\\Ellen\\Documents\\Algoritmer och datastrukturer\\EllenNihl_projekt"
        		+ "\\src\\Projekt\\Metadata.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            bufferedReader.readLine();
            while((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                Element aSong = new Element(parts[0], parts[0], parts[1], parts[2], parts[3]);
                hash.insert(aSong);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }

        System.out.println(hash.get("Cool Song2"));
        System.out.println(hash.get("Cool Song8"));
        






        // hash.insert("Mia");
        // hash.insert("Tim");
        // hash.insert("Bea");
        // hash.insert("Zoe");
        // hash.insert("Sue");
        // hash.insert("Len");
        // hash.insert("Moe");
        // hash.insert("Lou");
        // hash.insert("Rae");
        // hash.insert("Max");
        // hash.insert("Tod");
        // hash.print();
        // Item a = hash.get("Len");
        // System.out.println(" key(" + a.key + "): ||| " + a.song);
    }
}