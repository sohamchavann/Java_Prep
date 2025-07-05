//Constructor, Copy Constructors
package OOPS;

import java.util.*;

public class OPPSBasics2 {
    public static void main(String[] args) {
        PEN p1 = new PEN();
        p1.color = "Yellow";
        p1.tip = 2;
        p1.marks[0] = 10;
        p1.marks[1] = 20;
       System.out.println(p1.color);
       System.out.println(p1.tip);
       PEN p2 = new PEN(p1);
       p1.marks[0] = 12;
       System.out.println(p2.color);
       System.out.println(p2.tip);
       System.out.println(p2.marks[0]);
       System.out.println(p2.marks[1]);

    }
}
class PEN{
   int tip;
   String color;
   String pass;
   int marks[];
   
   PEN(){
       marks = new int[2];
   }
   PEN(PEN p1){
       marks = new int[2];
       this.tip = p1.tip;
       this.color = p1.color;
       this.marks=p1.marks;
   }
}
