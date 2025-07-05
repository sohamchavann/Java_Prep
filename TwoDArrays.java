//Problems1 of twoD Arrays

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][3];
        System.out.println("Enter the elements");
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
        largest(matrix);
    }
    public static boolean search(int matrix[][],int key){
        for(int i = 0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               if(matrix[i][j]==key){
                   System.out.println("ele found at : " +i +" " +j);
                   return true;
               }
            }
        }
        System.out.println("ele not found");
        return false;
    }
    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if (matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest Element is : " +largest);
        System.out.println("Smallest Element is : " +smallest);
    }
}
