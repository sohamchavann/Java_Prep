package OOPS;

public class OOPSBasics {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        p1.setTip(8);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        p1.setColor("Blue");
        BankAccount b1 = new BankAccount();
        b1.username ="Soham";
        b1.setPassword("salu");
        System.out.println(b1.getPass());
    }
}
class BankAccount{
    public String username;
    private String password;
    void setPassword(String newpass){
        password = newpass;
    }

    String getPass(){
         return this.password;
    }
        }
class Pen{
    private String color;
    private int tip;
    void setColor(String newColor){
        this.color = newColor;
    }
    String getColor(){
        return this.color;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
    int getTip(){
        return this.tip;
    }
}