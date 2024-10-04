package Old;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(1, "b");
        map.put(1, "c");
        map.put(1, "g");

        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<String> keyValues = new ArrayList<>(map.values());

        
        System.out.println("Key List: "+);
        System.out.println("Key Values: " + keyValues);
    }
}
