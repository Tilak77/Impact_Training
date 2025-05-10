import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input= sc.nextInt();
        //int jersey=4;
        
        if(input==1){
            System.out.println("Sachin");
        }
        else if(input==2){
            System.out.println("Rohit");
        }
        else if(input==3){
        System.out.println("Virat");
        }
        else if(input==4){
            System.out.println("ABD");
        }
        else{
            System.out.println("Dhoni");
        }
        sc.close();
    }
}
