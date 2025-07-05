import java.util.*;
public class meanproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
       float n3 = sc.nextFloat();
        
        Float mean = (n1+n2+n3)/3;
        System.out.println("Mean of 3 number is: "+mean);
    }
    
}
