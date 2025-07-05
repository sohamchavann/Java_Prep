package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myFile.txt");
            writer.write("Hii i am Soham");
            writer.close();
        }catch(IOException e){

        }

    }
}
