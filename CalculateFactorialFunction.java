import java.util.*;
public class CalculateFactorialFunction {
    
//------------------------ Function to Calculate Factorial. --------------------------------------- 

    static int factorial_fun(int n){
        int m=1;
        for(int i=n; i>0; i--){
            m=i*m;
        }
        return m;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();

        int result=factorial_fun(x);

        System.out.println("The Factorial of the Number is: " + result);


        sc.close();
    }
}
