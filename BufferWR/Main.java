package BufferWR;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Z:\\Placement\\CodesInJava\\BufferWR\\output.txt"));
        BufferedReader br = new BufferedReader(new FileReader("Z:\\Placement\\CodesInJava\\BufferWR\\soham.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}

