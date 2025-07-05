package OOPSBasicstoAdv;

public class temp {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        swap(a,b);
        System.out.println(a +" " + b);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
