public class CheckSumOfFactorIsSame {
    public static void main(String[] args) {
        int n=28;
        int j=0;
        int k=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            j=j+i;
            k=j/2;
        }
    }
        System.out.println("Sum of Numbers are:" + k);
        if(k==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}
