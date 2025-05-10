import java.util.*;
public class CountOddOrEven {
    
    static void countOdd_Even(int a[], int n){
        int odd=0, even=0;

        for(int val: a){
            if(val%2==0){
                odd++;
            }
            else{
                even++;
            }
        }
        System.out.println("*ODDS are: " + odd +"  " + "*EVENS are: " +  even);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        countOdd_Even(arr,size);


        sc.close();
    }
}
