package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        try {
            File obj = new File("myFile.txt");
            Scanner reader = new Scanner(obj);

            while(reader.hasNext()){
                String s = reader.nextLine();
                System.out.println(s);
                reader.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
