//sum of n numbers  

import java.util.*; 

/*public class counter {              
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n){
            sum = sum + i;      //sum += i
            i++;
            
        }
        System.out.println(sum);
    }
}*/
public class loopsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1 ; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}