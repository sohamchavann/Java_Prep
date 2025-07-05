package OOPSBasicstoAdv.ObjectCloning.DeepCopy;
public class Person {
    String name;
    int[] arr;
    Person(String name, int[] arr){
        this.name = name;
        this.arr = arr;
    }
    Person(Person p1){
        this.name = p1.name;
        this.arr = new int[p1.arr.length]; // Allocate new array
        for (int i = 0; i < p1.arr.length; i++) {
            this.arr[i] = p1.arr[i]; // Copy elements
        }
    }
    public static void main(String[] args) {
       Person p1 = new Person("Soham", new int[]{30,23});
       Person p2 = new Person(p1);
       p2.name = "Saloni";
       p2.arr[0] = 23;
       System.out.println(p1.arr[0]);
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
