import java.util.HashMap;
import java.util.Map;
public class MaxKeyInHashMap {
//----------------------- To find Maximum vlaue of a Key in HashMap -----------------------
    public static void main(String[] args) {
        HashMap<String, Integer> Team= new HashMap<>();
        Team.put("MI", 5);
        Team.put("CSK", 5);
        Team.put("GT", 1);
        Team.put("LSG", 0);
        Team.put("RCB", 10);
        Team.put("RR", 1);
        Team.put("KKR", 3);
        Team.put("DC", 0);
        Team.put("PK", 0);
        Team.put("SRH", 2);

        int max=0;
        String Team_name="";
        for(Map.Entry<String, Integer> entry : Team.entrySet()){
            if(entry.getValue() > max){
                max=entry.getValue();
                Team_name=entry.getKey();
            }
        }
        System.out.println(Team_name + " Got " + max + " Trophy.");
    }
}
