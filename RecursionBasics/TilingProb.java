package RecursionBasics;

public class TilingProb{
    public static void main(String[] args) {
        System.out.println(soln(7));
        StringBuilder sb = new StringBuilder("");
        
    }
    public static int soln(int n){
        if(n==0 || n==1){
            return 1;
        }
//        //vertical choice
//        int fnm1 = soln(n-1);
//
//        //horizontal choice
//        int fnm2 = soln(n-2);
//
//        int totWays = fnm1 +fnm2;
//        return totWays;
        return soln(n-1)+ soln(n-2);
    }
}
