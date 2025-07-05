package OOPSBasicstoAdv.Interface;


public class NiceCar implements Brake{
    private Engine engine;
    private Media player = new MediaPlayer();
    NiceCar(){
         engine = new PowerEngine();
    }
    void engineStart(){
        engine.start();
    }
    void engineStop(){
        engine.stop();
    }

    void startMusic(){
        player.start();
    }

    void stopMusic(){
        player.stop();
    }

    void upgradeCar(){
        engine = new ElectricEngine();
    }

    void downgradeCar(){
        engine = new PowerEngine();
    }
    @Override
    public void brake() {
        System.out.println("brakes are working");
    }
}
