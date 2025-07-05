package OOPSBasicstoAdv.InnerClassAndLamdaExpressions;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    void show();
}
class b{
    public static void main(String[] args) {
        FunctionalInterface I = new FunctionalInterface() {
            @Override
            public void show() {
                System.out.println("Anonymous Inner Class");
            }
        };

        I.show();
    }
}

