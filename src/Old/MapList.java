package Old;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapList {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Hello");
        map.put(2, "How");
        map.put(3, "are");
        map.put(4, null);
        map.put(null, null);

        // List<Integer> integers=new ArrayList<>(map.keySet());
        // List<String> list=new ArrayList<>(map.values());

        List<Integer> integers = map.keySet().stream().collect(Collectors.toList());
        List<String> list = map.values().stream().collect(Collectors.toList());
        System.out.println(integers + " " + list);

    }
}
