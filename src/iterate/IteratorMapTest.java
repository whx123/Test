package iterate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "jay");
        map.put(1, "whx");
        map.put(3, "huaxiao");

        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            // get key
            Integer key = (Integer) entry.getKey();
            // get value
            String value = (String) entry.getValue();

            System.out.println("key:"+key+",value:"+value);
        }
    }
}
