package OOPSBasicstoAdv.Temp;

class Parent {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");
    }

    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}

class Child extends Parent {
    // new m1() method
    // unique to Child class

    private void m1()
    {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility
    @Override public void m2()
    {
        System.out.println("From child m2()");
    }
}

class Geeks {
    public static void main(String[] args)
    {
        // parent class object
        Parent P = new Parent();
        P.m2();
        // child class object
        Parent C = new Child();
        C.m2();

    }
}
