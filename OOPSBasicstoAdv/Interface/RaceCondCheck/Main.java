package OOPSBasicstoAdv.Interface.RaceCondCheck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.mediaStart();
        car.mediaStop();

        Multimedia.temp();
    }
}
 interface Engine {
    void start();
    void stop();

}
 interface Media {
    void start();
    void stop();

}
interface Multimedia extends Media {
    static void temp(){
        System.out.println("hii Somu");
    }
    default void mediaStart(){
        start();
    }
    default void mediaStop(){
        stop();
    }
}
class Car implements Engine, Multimedia {
    @Override
    public void start() {
        System.out.println("Engine Start");
    }
    @Override
    public void stop() {
        System.out.println("Engine Stop");
    }
    @Override
    public void mediaStart() {
        System.out.println("Media Start");
    }
    @Override
    public void mediaStop() {
        System.out.println("Media Stop");
    }
}

