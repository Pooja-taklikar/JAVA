import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //Linked Hashmap preserve order
        //double linked list store all entries, due to this it little bit slow
        // and consume more memory then hashmap
        //time Complexity O(1)
//        LinkedHashMap<String,Integer> hashMap = new LinkedHashMap();
////        HashMap<String , Integer> hashMap = new HashMap<>();
//        hashMap.put("Orange",10);
//        hashMap.put("Apple",20);
//        hashMap.put("Guava",13);
//
//        for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        //true for access order --> Latest used will come at last(List recently used algorithm is using)
        //false for insertion order by default false
        LinkedHashMap<String,Integer> hashMap1 = new LinkedHashMap(11,0.5f,true);
        hashMap1.put("Orange",10);
        hashMap1.put("Apple",20);
        hashMap1.put("Guava",13);
        hashMap1.get("Apple");
        hashMap1.get("Orange");
        for(Map.Entry<String,Integer> entry : hashMap1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashMap<String, Integer> hashMap2 = new HashMap<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap<>(hashMap2);

        hashMap2.put("Shubham", 91);
        hashMap2.put("Bob",80);
        hashMap2.put("Akshit",78);

        Integer res = hashMap2.getOrDefault("Shubham",0);
        hashMap2.putIfAbsent("Shubham",92); //if present then it will not put inside map ,else it will put inside map
        System.out.println(hashMap2);  //if Shubham present then return that
        // value else by default it will return 0
    }
}
//caching -> least recently used their we were using linkedHashMap
//Linked hashMap is not thread safe like hash map
