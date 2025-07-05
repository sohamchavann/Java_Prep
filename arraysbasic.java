import java.util.*;

public class arraysbasic {
    
    public static void arrayinc(int marks[]){
         for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] - 1;           
         }                
    }

    public static void name(int yash[]){
       yash[0] = yash[0] + 1;
       System.out.println(yash[0]);
    }
    public static void main(String[] args) {
        int marks[] = {11,12,13};
        arrayinc(marks);
    for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);

    }

    int soham[]= {99,100,101};
    name(soham);
    System.out.println(soham[0]); 

    }
}