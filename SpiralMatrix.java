//write spiral elements in matrix
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][4];
        System.out.println("Enter the elements");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        soln(matrix);
    }
    public static void soln(int arr[][]){
        int startRow=0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
                //top
                for (int j = startCol;j<=endCol;j++){
                    System.out.print(arr[startRow][j] +" ");
                }
                //right
                for(int j = startRow+1;j<=endRow;j++){
                    System.out.print(arr[j][endCol] +" ");
                }
                //bottom
                for(int j = endCol-1;j>=startCol;j--){
                    if(startRow==endRow){
                        break;
                    }
                    System.out.print(arr[endRow][j] +" ");
                }
                //left
                for(int j = endRow-1;j>startRow;j--){
                    if(startCol==endCol){
                        break;
                    }
                    System.out.print(arr[j][startCol] +" ");
                }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}