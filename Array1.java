import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];


        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Using For Loop: ");

        //Using For Loop.
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Using For Each Loop: ");

        //Using For Each Loop.
        for(int val: arr){
            System.out.print(val+ " ");
        }

        System.out.println();
        System.out.println(arr.getClass());
        System.out.println(sc.getClass());


        sc.close();
    }
}
