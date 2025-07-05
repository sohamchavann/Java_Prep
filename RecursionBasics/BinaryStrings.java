package RecursionBasics;

public class BinaryStrings {
    public static void main(String[] args) {
        soln(3,0,new String(""));
    }
    public static void soln(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastplace==0){
            soln(n-1,0,str+'0');
            soln(n-1,1,str+'1');
        }
        else{
            soln(n-1,0,str+=0);
        }
    }
}
