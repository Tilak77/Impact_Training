import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the No. of Day: 6");
        int input= sc.nextInt();
        
        //int Day=2;
        switch(input){
            case(1):
            System.out.println("Monday");
            break;
            case(2):
            System.out.println("Tuesday");
            break;
            case(3):
            System.out.println("Wednesday");
            break;
            case(4):
            System.out.println("Thursday");
            break;
            case(5):
            System.out.println("Friday");
            break;
            case(6):
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Sunday");
        }

        sc.close();        
    }
}
