import java.util.*;

public class OccurenceOfElementInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String arr[]= new String[]{};
        String str=sc.nextLine();
        String element="A";
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== element.charAt(0)){
                count++;
            }
        }
        System.out.println("Occurence of the Element: " + count);
        
        sc.close();
    }
}
