import java.util.*;
public class CountZeroAndOnesInArray {
    
    static void countZero_Ones(int a[], int n){
        int zc=0, oc=0;

        for(int val: a){
            if(val==1){
                oc++;
            }
            else{
                zc++;
            }
        }
        System.out.println("*No. of Zeros: " + zc +"  " + "*No. of Ones: " +  oc);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        countZero_Ones(arr,size);


        sc.close();
    }
}
