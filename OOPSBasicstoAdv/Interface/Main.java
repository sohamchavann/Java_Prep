package OOPSBasicstoAdv.Interface;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.acc();
//        car.start();
//        car.stop();

        NiceCar mycar = new NiceCar();
        mycar.engineStart();
        mycar.engineStop();
        mycar.startMusic();
        mycar.stopMusic();
        mycar.brake();

        mycar.upgradeCar();
        mycar.engineStart();
        mycar.engineStop();

        mycar.downgradeCar();
        mycar.engineStart();
        mycar.engineStop();
    }
}
