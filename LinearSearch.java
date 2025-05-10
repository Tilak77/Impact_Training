import java.util.*;
public class LinearSearch {
    static int linearsearch(int[] arr, int num, int size){
        for(int i=0; i<size; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int[size];

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        
        int num=sc.nextInt();
        int res= linearsearch(arr, num, size);
        if(res == -1){
            System.out.println("Element Not Found!");
        }
        else{
            System.out.println("Element is at Index: " + res);
        }
        
        sc.close();
    }
}
