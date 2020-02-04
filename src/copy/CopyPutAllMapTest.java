package copy;

import java.util.HashMap;

public class CopyPutAllMapTest {
    public static void main(String[] args) {
        HashMap<Integer, User> userMap = new HashMap<>();

        userMap.put(1, new User("jay", 26));
        userMap.put(2, new User("fany", 25));

        //Shallow clone
        HashMap<Integer, User> clonedMap = new HashMap<>();
        clonedMap.putAll(userMap);

        //Same as employeeMap
        System.out.println(clonedMap);

        System.out.println("\nChanges reflect in both maps \n");

        //Change a value is clonedMap
        clonedMap.get(1).setName("test");

        //Verify content of both maps
        System.out.println(userMap);
        System.out.println(clonedMap);
    }
}
