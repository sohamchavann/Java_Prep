//check wheter no. is power of two or not
public class powof2 {
    public static void main(String[] args) {
        int n = 3;
        if((n & n-1) == 0){
            System.out.println("yes, it is  power of two");
        }
        else System.out.println("false");
    }
}
