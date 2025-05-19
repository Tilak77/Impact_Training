import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num=4;
        for(int i=1; i<=num; i++){
            for(int j=num; j>i; j--){
                System.out.print(" ");
            }
            for(int k=i; k<=(i*2-1); k++){
                System.out.print(k);
            }
            for(int l=(i-1)*2; l>=i; l--){
                System.out.print(l);
            }
            System.out.println();
        }

        sc.close();
    }
}
