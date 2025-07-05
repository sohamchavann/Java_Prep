package OOPSBasicstoAdv.Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double weight){
        this.weight = weight;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight (double l, double w, double h, double weight){
        super(l, w, h);
        this.weight = weight;
    }
    @Override
    void show(){
        System.out.println(" i am in boxweight class ");
    }
}
