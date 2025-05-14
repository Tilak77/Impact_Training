import java.util.*;
public class CheckPrimeNumberInArrayFunction{
    
//------------------------ Function to Check How many Numbers are Prime in an Array. --------------------------------------- 

    //Check Number is Prime or Not
   public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to find and print prime numbers in an Array
    public static void findPrimesInArray(int[] arr) {
        System.out.print("Prime numbers in the array: ");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        
        findPrimesInArray(arr);


        sc.close();
    }
}
