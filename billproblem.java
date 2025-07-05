/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

import java.util.*;
public class billproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil");
        float p1 = sc.nextFloat();
        System.out.println("Enter cost of pen");
        float p2 = sc.nextFloat();
        System.out.println("Enter cost of eraser");
        float p3 = sc.nextFloat();

        float total = ((p1+p2+p3)*18/100)+p1+p2+p3;
        System.out.println("Total Bill with GST:");
        System.out.println(total);

    }
    
}
