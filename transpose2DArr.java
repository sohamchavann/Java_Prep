//Print Transpose Of Array

import java.util.*;
public class transpose2DArr {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int matrix[][]=
                    {{1,2},{3,4},{5,6}};
            transpose(matrix);
        }
        public static void transpose(int arr[][]){
            int n = arr.length;
            int m = arr[0].length;
            int trans[][] = new int[m][n];
            for(int i = 0;i<n;i++){
                for(int j = 0; j<m;j++){
                    trans[j][i] = arr[i][j];
                }
            }
            for(int i = 0;i<m;i++){
                for(int j = 0; j<n;j++){
                    System.out.print(trans[i][j] + " ");
                }
                System.out.println();
            }

    }
}


