package OOPSBasicstoAdv.ObjectCloning;

public class Person implements Cloneable{
    String name;
    int[] arr;
    Person(String name, int[] arr){
        this.name = name;
        this.arr = arr;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Person s1 = new Person("Soham", new int[]{30,23});
        Person s2 = (Person) s1.clone();
        s2.arr[0] = 23;
        System.out.println(s1.arr[0]);

    }
}
