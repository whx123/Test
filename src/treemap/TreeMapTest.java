package treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("2010", "jay");
        map.put("1999", "whx");
        map.put("3010", "huaxiao");

        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            // get key
            String key = (String) entry.getKey();
            // get value
            String value = (String) entry.getValue();

            System.out.println("key:"+key+",value:"+value);
        }
    }
}
