import java.util.HashMap;
import java.util.Map;

public class IdentityHashMap {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
//        Map<String, Integer> map = new HashMap<>(); // Only key=2 will print
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        Map<String, Integer> map = new java.util.IdentityHashMap<>();
        //hashcode and equals in identity class is from object which we are creating new String
        //so for both key hashcode will different
        //identityHashcode and == (address will check here)
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(key1.equals(key2));
        System.out.println(map);
    }
}
