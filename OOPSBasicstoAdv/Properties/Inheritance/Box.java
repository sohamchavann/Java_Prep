package OOPSBasicstoAdv.Properties.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    void show(){
        System.out.println(" i am in box class ");
    }
}
