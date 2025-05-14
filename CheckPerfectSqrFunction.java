import java.util.*;
public class CheckPerfectSqrFunction{


// ------------------- To check if the Number is Perfect Square or Not using Function ---------------------
    
    
    static int perfect_sqr(int n){
        if(n>=0){
           int m= (int)Math.sqrt(n);
           if(m*m== n){
            return 1;
           }  
           else{
            return 0;
        }
    }
    else{
        return 0;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int result=perfect_sqr(x);
        System.out.println(result);
        if(result==1){
            System.out.println("It is a Perfect Square");
        }
        else{
            System.out.println("It is Not a Perfect Square");
        }

        sc.close();

    }
}