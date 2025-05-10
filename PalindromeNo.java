import java.util.ArrayList;
public class PalindromeNo {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        int start=0;
        int end=list.size()-1;

        while(start< end){
            if(!list.get(start).equals(list.get(end))){
                System.out.println("The No. is Not A Palindrome");
            }
            
            start++;
            end--;
        }
        System.out.println("The No. is A Palindrome");
    }
}
