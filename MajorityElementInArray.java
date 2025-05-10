import java.util.*;
public class MajorityElementInArray {
    
    static int find_majority(int arr[], int size){
        int candidate= arr[size/2];
        int count=0;

        for(int val: arr){
            if(val==candidate){
                count++;
            }
        }
        if(count > arr[size/2]){
            return candidate;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int result = find_majority(arr,size);
        if(result == -1){
            System.out.println("No Majority Element");
        }
        else{
            System.out.println("The Majority Element is: " + result);
        }



        sc.close();
    }
}
