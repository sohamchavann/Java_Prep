package OOPSBasicstoAdv.Interface;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("i brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i Start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i Stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like a normal car");
    }
}
