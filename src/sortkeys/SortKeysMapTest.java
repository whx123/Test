package sortkeys;

import java.util.*;

public class SortKeysMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("2010", "jay");
        map.put("1999", "whx");
        map.put("3010", "huaxiao");

        List<Map.Entry<String,String>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (Map.Entry e1, Map.Entry e2)-> {
                return e1.getKey().toString().compareTo(e2.getKey().toString());
        });

        for (Map.Entry entry : list) {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }

    }
}
