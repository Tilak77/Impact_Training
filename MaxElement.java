import java.util.*;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Array Size and Elements: ");
        int size= sc.nextInt();
        int[] arr= new int[size];

        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        
        //Way 1: 
        // int max=0;
        // for(int val: arr){
        //     if(val>max){
        //         max=val;
        //     }
        // }
        // System.out.println("The Maximum Element is: " + max);
    

        // Way 2:
        int max=arr[0];
        for(int i=1; i<size; i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        System.out.println("The Maximum Element is: " + max);
    

    
    sc.close();

    }
}
