package FileHandling;

import java.io.File;

public class DeleteFIle {
    public static void main(String[] args) {
        File obj = new File("myFile.txt");
        obj.delete();
    }
}
