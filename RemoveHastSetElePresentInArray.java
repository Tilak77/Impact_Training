import java.util.*;
public class RemoveHastSetElePresentInArray {

//-----------------To Remove all elements from HashSet which is present in Array----------------------
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        System.out.println("Original HashSet: " + hs);

        int[] arr={2,4,6,8};

        for(int num: arr){
            hs.remove(num);
        }

        System.out.println("HashSet after Removal: " + hs);
    }
}
