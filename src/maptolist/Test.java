package maptolist;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "jay");
        map.put(1, "whx");
        map.put(3, "huaxiao");

        List<Integer> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);

        List<String> valueList = new ArrayList<>(map.values());
        System.out.println(valueList);

        List entryList = new ArrayList(map.entrySet());
        System.out.println(entryList);

    }
}
