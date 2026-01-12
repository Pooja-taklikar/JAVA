import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Monishka");
        map.put(2,"Neha");
        map.put(3,"Shraddha");
//        map.put(null,"Vipul");
//        map.put(null,"Ram");
        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);

        String s = map.get(4);
        System.out.println(s);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Monishka"));

//        Set<Integer> keys = map.keySet();
//        for(int i : keys){

        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

//        map.remove(31);
        boolean res = map.remove(3,"Monu");
        System.out.println("REMOVED ? :" + res);
        System.out.println(map);

        List<Integer> list = Arrays.asList(2,4,32,43,4,432);
        list.contains(32); //linear search O(n)
    }
}
