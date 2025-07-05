import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The Number");
        // int n = sc.nextInt();
        //primerange(n);
        //boolean isPrime = checkprimeno(n);

        // if(isPrime == true){
        //     System.out.println("n is prime number");
        // }else{
        //     System.out.println("n is not a prime number");
        // }
        bin2dec(1001);
    }

    public static boolean checkprimeno(int n){            
           boolean isPrime = true;
            for(int i = 2; i<n; i++){
               if(n%i == 0){
                    isPrime = false;
                }            
            }
        
    return isPrime; 
    }

    public static void primerange(int n){
        for(int i=2;i<=n;i++){
            if (checkprimeno(i)==true) {
                System.out.println(i +"");                
            }
        }
    }
    
    public static void bin2dec(int binNum){
       int oriBi = binNum ;
       int decNum = 0;
       int pow = 0;
       while (binNum>0) {
        int lastDigit = binNum%10;
        decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
        pow++;
        binNum = binNum/10;  
       }
       System.out.println("decimal number of "+ oriBi +" is "+ decNum);
    }
    }

