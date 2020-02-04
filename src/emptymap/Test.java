package emptymap;

import java.util.Collections;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map map = Collections.emptyMap();

        Map<String, String> map1 = Collections.<String, String>emptyMap();
        map1.put("1", "1");

    }
}
