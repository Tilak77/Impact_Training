import java.util.Scanner;
public class rep_else {

    static void replace_ele(long[] arr, int size){
        long sum=0;
        for(long val:arr){
            sum+=val;
        }
        for(int i=0; i<size; i++){
            arr[i]=sum-arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        long[] arr= new long[size];
    
        for(int i=0; i<size; i++){
            arr[i]= sc.nextLong();
        }

        replace_ele(arr, size);
        
        for(long val: arr){
        System.out.println(val + " ");
        }
    
    sc.close();
    }
}
