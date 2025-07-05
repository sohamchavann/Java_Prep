//print numbers expect multiple of 10
import java.util.*;
public class continueloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{ 
            System.out.println("Enter You Number");
            
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
