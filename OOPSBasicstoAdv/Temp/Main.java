package OOPSBasicstoAdv.Temp;

import OOPSBasicstoAdv.AccessModifers.A;
import OOPSBasicstoAdv.AccessModifers.B;

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        C obj1 = new C();
//        //obj.show();

        String s1 = new String("Soham");
        String s2 = new String("Soham");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(obj.equals(obj1));
        System.out.println(obj==obj1);
    }
}
