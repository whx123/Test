package iterate;

import java.util.HashMap;
import java.util.Map;

public class EntryMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "jay");
        map.put(1, "whx");
        map.put(3, "huaxiao");

        for(Map.Entry entry: map.entrySet()) {
            // get key
            Integer key = (Integer) entry.getKey();
            // get value
            String value = (String) entry.getValue();

            System.out.println("key:"+key+",value:"+value);
        }
    }
}
