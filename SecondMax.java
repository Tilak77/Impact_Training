import java.util.*;
public class SecondMax {


    static int findSecMax(int[] arr, int size){
        int max=arr[0], sec_max=Integer.MIN_VALUE;
        for(int i=1; i<size; i++){
            if(arr[i] > max){
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]!=max && arr[i]>sec_max){
                sec_max=arr[i];
            }
        }
        return sec_max;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Array Size and Elements: ");
        int size= sc.nextInt();
        int[] arr= new int[size];

        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        int res= findSecMax(arr, size);
        System.out.println(res);



    
    sc.close();

    }
}
