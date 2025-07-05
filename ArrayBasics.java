
import java.util.*;

public class ArrayBasics{
    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter The Size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[]= new int[n];
        System.out.println("Enter the Elements in the array");
        for(int i = 0; i<n; i++ ){
            marks[i] = sc.nextInt();
        }
        update(marks);

        for(int i=0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}