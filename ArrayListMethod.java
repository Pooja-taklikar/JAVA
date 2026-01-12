import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday","Tuesday");
        System.out.println(list1.getClass().getName());
//        list1.add("wednesday"); // It will throw exception as list return fixed sized list
//        You can not add or remove from asList, you can replace in asList
        list1.set(1,"Sunday");

        String[] array = {"Apple","Banana","Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);

//        List.of Not able to add, remove and replace also
        List<Integer> list3 = List.of(1, 2, 3, 4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(2);
        list5.add(3);
//addAll add all the element from collection
        list5.addAll(list3);

//        Collections.sort(list5);  // we can sort list like this
//        list5.sort(null); // Another way of sorting element
        System.out.println(list5);




//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(20);
//        list.add(30);
//        list.add(50);
//        list.add(2,80); //it placed element between 30 and 50
//        list.set(2,40);  // it will replace element of second index replacing 50 with 40
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//
//        for(int i =0 ; i< list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println(list);
//
//        for(int x : list){
//            System.out.println(x);
//        }
//
//        System.out.println(list.contains(50));
//        System.out.println(list.contains(2));
//        System.out.println(list.remove(2));
//        System.out.println(list.size());


    }
}
