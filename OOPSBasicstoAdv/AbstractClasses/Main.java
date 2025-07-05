package OOPSBasicstoAdv.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        Daughter d1 = new Daughter();

        son.career();
        d1.career();
        //Son.career();
        Parent.play();
//        Parent.career();
    }
}
