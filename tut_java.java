import java.util.*;
  public class tut_java{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter four numbers:");
        int a= sc.nextInt(); 
        int b=sc.nextInt(); 
        int c= sc.nextInt(); 
        int d=sc.nextInt();
    double frac1= (double) a/c;
    double frac2=(double) b/d;
        double sum= frac1+frac2;
        double sub= frac1+frac2;
        double mult= frac1*frac2;
        double div= frac1/frac2;
         System.out.println("The sum is "+sum);
         System.out.println("The difference is "+sub);
         System.out.println("The product is "+mult);
         System.out.println("The division is "+div);
}
}