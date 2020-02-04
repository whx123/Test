package copy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;

public class CopyDeepMapTest {

    public static void main(String[] args) {
        HashMap<Integer, User> userMap = new HashMap<>();

        userMap.put(1, new User("jay", 26));
        userMap.put(2, new User("fany", 25));

        //Shallow clone
        Gson gson = new Gson();
        String jsonString = gson.toJson(userMap);

        Type type = new TypeToken<HashMap<Integer, User>>(){}.getType();
        HashMap<Integer, User> clonedMap = gson.fromJson(jsonString, type);

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
