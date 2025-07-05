//Calculate Diagonal Sum in n*n matrix

import java.util.Scanner;

public class DiagSum2DArray {
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
        //sum(matrix);
        sumoptimized(matrix);

    }
    public static void sum(int matrix[][]){
        int sum = 0;
        int n= matrix.length;
        for(int i = 0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    sum = sum + matrix[i][j];
                }
                else if(i + j == n -  1){
                    sum += matrix[i][j];
                }
            }

            }
        System.out.println(sum);
        }
    public static void sumoptimized(int matrix[][]){
        int sum = 0;
        int n= matrix.length;
        for(int i = 0;i<n;i++) {
            sum += matrix[i][i];

            if(i != n-1-i){ //overlapping element optimization
                sum += matrix[i][n-1-i];
            }
        }
        System.out.println(sum);
    }
    }
