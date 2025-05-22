import java.util.HashMap;
public class HashMapEg {
    public static void main(String[] args) {
        HashMap<String, Integer> Bucket= new HashMap<>();
        Bucket.put("Pen", 1);
        Bucket.put("Glass", 5);
        Bucket.put("Marker", 2);
        Bucket.put("Phone", 7);
        Bucket.put("Bench", 9);
        Bucket.put("Board", 10);

        System.out.println(Bucket);

        if(Bucket.containsKey("Glass")){
            Bucket.remove("Glass");
        }else{
            System.out.println("Absent");
        }
        Bucket.put("Pen", 45);

        System.out.println(Bucket);
        for(String i: Bucket.keySet()){
            System.out.println(i);
        }
    }
}
