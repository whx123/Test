package sortkeys;

import java.util.*;

public class SortKeys2MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("2010", "jay");
        map.put("1999", "whx");
        map.put("3010", "huaxiao");
        map.put("2011", "fangy");

        SortedMap sortedMap = new TreeMap(new Comparator<String>() {
            @Override
            public int compare(String k1, String k2) {
                return k1.compareTo(k2);
            }
        });
        sortedMap.putAll(map);

        Iterator itr = sortedMap.entrySet().iterator();
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
