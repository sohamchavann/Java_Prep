package OOPSBasicstoAdv.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.println(box1.h + " " +box1.l +" " +box1.w);
//        Box box2 = new Box(23);
//        System.out.println(box2.h + " " +box2.l +" " +box2.w);
//        BoxWeight box3 = new BoxWeight(21, 22, 23, 24);
//        System.out.println(box3.h + " " +box3.l +" " +box3.w + " " + box3.weight);

        //Box box4 = new BoxWeight(23);
        //System.out.println(box4.weight);
        // here we get an error because Box is the reference variable
        // and we are creating an object of boxweight.
        // but we cannot access members other than reference variable members.
        // therefore we are getting compilation error

        //BoxWeight box5 = new Box(weight);
        // this is not allowed

        //BoxPrice bp1 = new BoxPrice(2, 4, 12);
        //System.out.println(bp1.l+" " +bp1.h +" " +bp1.w +" " +bp1.weight +" " +bp1.price);


        Box bnew = new BoxWeight();
        bnew.show();
    }
}
