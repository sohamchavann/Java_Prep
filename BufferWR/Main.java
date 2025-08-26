package BufferWR;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Z:\\Placement\\CodesInJava\\BufferWR\\output.txt"));
            BufferedReader br = new BufferedReader(new FileReader("Z:\\Placement\\CodesInJava\\BufferWR\\soham.txt"));){

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        }catch(IOException e){
            System.out.println("Enter valid path");
        }finally {
            System.out.println("Excepttiio m");
            }
        }

    }


