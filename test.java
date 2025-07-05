import java.util.Scanner;

public class test {
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your income");
    int n1 = sc.nextInt();
    int tax;

    if (n1<500000) {
        tax = 0;
    }
    else if(n1>500000 && n1<1000000){
         tax = (int) (n1*0.2);
       
    }
    else {
        tax = (int)(n1*0.3);
}
System.out.println("your tax is : " + tax );
}
}