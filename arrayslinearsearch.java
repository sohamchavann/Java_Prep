import java.util.*;
        public class arrayslinearsearch {
            public static void main(String[] args){
                System.out.println("Enter the size of array");
                Scanner sc =new Scanner(System.in);
                int n =  sc.nextInt();
                int marks[] = new int[n];
                System.out.println("Enter the elements in the array");
                for (int i=0;i<=n-1;i++){
                    marks[i] = sc.nextInt();
                }
                System.out.println("Enter the key");
                int key = sc.nextInt();

                int sol = linearsearchs(key, marks);
                if(sol==-1){
                    System.out.println("Entered Element is not present in array");
                }
                else{
                    System.out.println("Entered element is at index "+sol );
                }

            }
        public static int linearsearchs(int key, int[] marks){
            for(int i = 0;i<=marks.length-1;i++){
                if (marks[i] == key){
                    return i;
                }
            }
            return -1;
        }

    }



