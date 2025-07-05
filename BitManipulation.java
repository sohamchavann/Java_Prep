public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(getithbit(8,2));
        System.out.println(setithbit(8,1));
        System.out.println(clearithbit(10,1));
        System.out.println(updateithbit(8,2,1));
        System.out.println(clearlastithbits(8,4));
        System.out.println(clearrange(10,2, 3));
    }
    public static int getithbit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setithbit(int n, int i){
        int bitmask = 1<<i;
        return  n | bitmask;
    }
    public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateithbit(int n,int i, int newBit){
        n = clearithbit( n, i);
        int bitmask = newBit<<i;
        return n | bitmask;
    }
    public static int clearlastithbits(int n , int i ){
        int bitmask = (~(0)<<i);
        return n & bitmask;
    }
    public static int clearrange(int n, int i, int j){
        int a = (~(0)<<j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
}