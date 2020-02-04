package immutablemap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {
    private static final Map<Integer, String> map;
    static {
        Map<Integer,String> aMap = new HashMap<>();
        aMap.put(1, "one");
        aMap.put(2, "two");
        map = Collections.unmodifiableMap(aMap);
    }

    public static void main(String[] args) {
        map.put(3, "3");
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
