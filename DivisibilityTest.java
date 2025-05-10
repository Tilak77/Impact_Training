public class DivisibilityTest {
    public static void main(String[] args) {
        int num=28;

        if(num%3==0 && num%5==0){
            System.out.println("The Number is Divisible by Both 3 & 5");
        }
        else if(num%3==0){
            System.out.println("The Number is Divisible by 3");
        }
        else if(num%5==0){
            System.out.println("The Number is Divisible by 5");
        }
        else{
            System.out.println("The Number is Not Divisible by Both");
        }
    }
}
