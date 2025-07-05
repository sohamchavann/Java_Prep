// import java.util.*;
 public class hollowrectangle {
    public static void main(String[] args){
        printpattern(5);
   }
//     public static void printhollowrectangle(int totRows,int totCols){
//         for(int i=1;i<=totRows;i++){
//             for(int j=1;j<=totCols;j++){
//                 if (i==1 || i==totRows || j==1 || j==totCols) {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
public static void printpattern(int n){
    for(int i=1;i<=n;i++){
        int emptyspaces = n - i;
        for(int j=1;j<=emptyspaces;j++){
            System.out.print(0 + " ");
        }
        int nonempty = 2*i-1;
        int k = n-i+1;
        int start = k;
        for(int j=1;j<=nonempty;j++){
            System.out.print(k + " ");
            k = k+start;
        }
        for(int j=1;j<=emptyspaces;j++){
            System.out.print(0 + " ");
        }
        System.out.println();
    }
} }
