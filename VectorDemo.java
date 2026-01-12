import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
//        Vector<Integer> vec = new Vector<>(5,2);
//        vec.add(1);
//        vec.add(1);
//        vec.add(1);
//        vec.add(1);
//        vec.add(1);
//        System.out.println(vec.capacity());
//        vec.add(1);
//        System.out.println(vec.capacity());// capacity incresse by double
//        we can customize capacityIcrement factor(5,3)
//
//        Vector<Integer> vec1 = new Vector<>(Arrays.asList(1,2,3));
//        Vector<Integer> vec2 = new Vector<>(vec);
        Counter a = new Counter();
        Counter b = new Counter();
        System.out.println(Counter.count);
        System.out.println(a);
        System.out.println(b);
    }
}
