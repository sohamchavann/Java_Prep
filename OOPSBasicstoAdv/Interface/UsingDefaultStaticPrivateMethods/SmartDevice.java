package OOPSBasicstoAdv.Interface.UsingDefaultStaticPrivateMethods;

interface SmartDevice {
    void turnOn();
    void turnOff();
    default void reset() { // Default method with body
        warningMsg();
        System.out.println("Device is resetting to factory settings...");
        System.out.println();
    }
    static void getDeviceCount() { // Static method
        fetchMsg();
        System.out.println("Total Smart Devices connected: 5");
        System.out.println();
    }
    private void warningMsg(){ //private method
        System.out.println("Warning!!!");
    }
    private static void fetchMsg(){ //private static method
        System.out.println("Fetching from Cloud");
    }
}