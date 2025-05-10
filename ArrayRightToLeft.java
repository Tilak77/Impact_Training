import java.util.Scanner;
public class ArrayRightToLeft {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];

        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("The Right to Left Array: ");
        for(int i=size-1; i>=0; i--){
            System.out.print(arr[i] + "-> ");
        }
        

        System.out.println();
        System.out.println("The Left to Right Array: ");
        for(int i=0; i<=size-1; i++){
            System.out.print(arr[i] + "-> ");
        }
        
        System.out.println();
        System.out.println("The Right to Left Array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[size-i-1] + "-> ");
        }

        sc.close();
    }
}
