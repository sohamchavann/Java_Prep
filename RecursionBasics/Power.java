//Find x^n
package RecursionBasics;

public class Power {
    public static void main(String[] args) {
        System.out.println(findPower(2,10));
        System.out.println(poweropti(2,10));
    }
    public static int findPower(int x, int n){//O(n)
        if(n==0){
            return 1;
        }
        int powXNm1 = findPower(x, n-1);
        int powXN = x * powXNm1;

        return powXN;
    }

    public static int poweropti(int x, int n){//O(logn)
        if(n==0){
            return 1;
        }
        int halfpower = poweropti(x,n/2);
        int total = halfpower*halfpower;
        if(n%2!=0){
             total = total * x;
        }
        return total;
    }
}
