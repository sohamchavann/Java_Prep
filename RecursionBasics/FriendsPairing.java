package RecursionBasics;

public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(soln(3));
    }
    public static int soln(int n){
        if(n==1 || n==2){
            return n;
        }
        //single:
        int fnm1 = soln(n-1);
        //pair
        int fnm2 =soln(n-2);
        int totwayspair = (n-1)*fnm2;
        int totways = fnm1 + totwayspair;
        return totways;
    }
}
