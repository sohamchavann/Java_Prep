import java.util.Scanner;

public class BinomialCoefficient {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        int NCR = biCoeff(a, b);
        System.out.println("Binomial Coeficient is" +NCR);
    }
    public static int fact(int a){
        int factorial = 1;
        for(int i=1;i<=a;i++){
            factorial = factorial*i;
        }
        return factorial;
    }

    public static int biCoeff(int n , int r){
        int factN = fact(n);
        int factR = fact(r);
        int factSub = fact(n-r);

        int NCR = factN/factR*factSub; 
        
        return NCR;
    }
    }

