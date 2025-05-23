import java.util.Scanner;
public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int n= sc.nextInt();

        boolean ans=false;

        for(int j=0; j<size; j++){
            if(arr[j]==n){
                System.out.println("Element Found: " + arr[j]);
                ans= true;
                break;
            }
        }
        if(!ans){
            System.out.println("Element Not found!!");
        }


        sc.close();
    }
}
