package OOPSBasicstoAdv.Interface.UsingDefaultStaticPrivateMethods;

public class Main {
    public static void main(String[] args) {
        SmartDevice tv = new SmartTV();
        SmartDevice light = new SmartLight();

        tv.turnOn();
        tv.reset();          // uses private method inside

        light.turnOff();
        light.reset();   // also uses private method inside

        SmartDevice.getDeviceCount(); // uses private static method
    }
}
