import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>((a,b) -> b - a); //by default ascending order
        map.put(91,"pooja");
        map.put(90,"Harsh");
        map.put(96,"Aachal");
        map.put(93,"saurabh"); //log(n)
        System.out.println(map);
        map.get(77); //log(n)
        map.containsKey(78); //O(n)
        map.containsValue(91); // O(n)
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(93)); // exclude 93
        System.out.println(map.tailMap(91)); //include 93

//        nagigableMap extend sorted map and treeMap implement navigableMap
//        SortedMap and Navigable both are interfaces and treeMap is implementation of navigable map
//        treeMap is interface

        NavigableMap<Integer,String> navigableMap = new TreeMap<>();

        navigableMap.put(1,"One");
        navigableMap.put(5,"Five");
        navigableMap.put(3,"Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(3));
        System.out.println(navigableMap.higherEntry(1));
    }
}
