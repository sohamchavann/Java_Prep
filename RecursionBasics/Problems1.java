//print numbers in decreasing order of given integer till 1
//print numbers in inc order of given integer from 1
//print factorial of given integer
//print sum of n natural numbers
//print nth fibonacci number

package RecursionBasics;

public class Problems1 {
    public static void main(String[  ] args) {
        int n = 10;
        //printInc(n);
        System.out.println(printFac(n));
        System.out.println(printSum(n));
        System.out.println(printFib(25 ));
    }
    public static void printDec(int n){
        if (n==1){
            System.out.print(n +" ");
            return;
        }
        System.out.print(n +" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if (n==1){
            System.out.print(n +" ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int printFac(int n){
        if (n==0){
            return 1;
        }
        int fnm1 = printFac(n-1);
        int func =  n * fnm1;
        return func;
    }

    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        int fnm1 = printSum(n-1); //fnm1 = func (n minus 1)
        int func = n + fnm1;
        return func;
    }

    public static int printFib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibnm1 = printFib(n-1);
        int fibnm2 = printFib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
}
