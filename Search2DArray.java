// Search in 2d array with min possible time complexity
import java.util.*;
public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]= {{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        search(matrix, 50);

    }
    public static boolean search(int matrix[][],int key){
        int currRow = 0;
        int currCol = matrix[0].length-1;
        while(currRow<=matrix.length-1 && currCol>=0){
            if(matrix[currRow][currCol] == key ){
                System.out.println("index of element is : " +currRow +" " +currCol );
                return true;
            } else if (matrix[currRow][currCol] < key) {
                currRow++;
            }else{
                currCol--;
            }
        }
        System.out.println("ele not found");
        return false;
    }
    public static boolean search1(int matrix[][], int key){
        int currCol = 0;
        int currRow = matrix.length-1;
        while(currRow >= 0 && currCol<=matrix[0].length-1){
            if (matrix[currRow][currCol]==key){
                System.out.println("ele found at index " +currRow +" " +currCol);
                return true;
            }
            if (matrix[currRow][currCol]>key){
                currRow--;
            }
            else{
                currCol++;
            }
        }
        System.out.println("ele not found");
        return false;
    }
}
