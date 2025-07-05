package BackTracking;

public class GridWays {
    public static int gridWays(int x, int y, int n, int m){
        //base case
        if(x == n-1 && y == m-1){ // last cell condition
            return 1;
        } else if (x==n || y==n) { //boundary condition
            return 0;
        }
        int w1 = gridWays(x+1,y,n,m);
        int w2 = gridWays(x,y+1,n,m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n =3, m=3;
        System.out.println(gridWays(0,0,n,m));
    }
}
