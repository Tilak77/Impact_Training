import java.util.*;
public class HashSetEg {
    public static void main(String[] args) {
        HashSet<String> Bucket = new HashSet<>();
        Bucket.add("Ronaldo");
        Bucket.add("Virat");
        Bucket.add("Thalla");
        Bucket.add("Rohit");

        System.out.println(Bucket);

        if(Bucket.contains("Virat")){
            Bucket.remove("Virat");
        }else{
            System.out.println("Absent");
        }
        System.out.println(Bucket);
        for(String e:Bucket){
            System.out.println(e);
        }
    }
}
