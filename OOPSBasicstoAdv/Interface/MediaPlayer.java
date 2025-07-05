package OOPSBasicstoAdv.Interface;

public class MediaPlayer implements Media{

    @Override
    public void start() {
        System.out.println("media player Start");
    }

    @Override
    public void stop() {
        System.out.println("media player Stop");

    }
}
