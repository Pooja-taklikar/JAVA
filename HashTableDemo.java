import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        //Hashtable is synchronized
        //no null key or value
        //Legacy class, replaced with concurrentHashMap
        //slower than hashMap
        //all map methods we can use here
        //only linkedList incase of collision
//        All Method are synchronized
//        hashtable.put(1,"Apple");
//        hashtable.put(2,"banana");
//        hashtable.remove(1);
//        System.out.println(
//                hashtable
//        );
//        hashtable.put(null,"value");// throws exception
//        hashtable.put(4,null); //throws exception

//        HashMap<Integer,String> map = new HashMap<>();
        Hashtable<Integer,String> map = new Hashtable<>();
        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 1000;i++){
                map.put(i,"Thread1");
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i = 1000; i < 2000;i++){
                map.put(i,"Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final size of Hashmap: " + map.size());
    }
}
