package immutablemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {
    private static final Map <Integer,String>map;
    static {
        map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
    }
    public static void main(String[] args) {
        map.put(3, "three");
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
