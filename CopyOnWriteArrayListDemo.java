import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

//        List<String> shoppingList = new ArrayList<>(); // It will give error
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List: " + shoppingList);

        for(String item : shoppingList){
            System.out.println(item);
            //try to modify the list while reading
            if(item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading.");
            }
        }
        System.out.println("Update Shopping List: " + shoppingList);

        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");

        Thread readerThread = new Thread(() -> {
            try{
                while(true){
                    for(String item : sharedList){
                        System.out.println("Reading item: " + item);
                        Thread.sleep(100); //small deplay to simulate work
                    }
                }
            }catch (Exception e){
                System.out.println("Exeception in reader thread: " + e);
            }
        });

        Thread writerThread = new Thread(() -> {
            try{
                Thread.sleep(500); //Delay to allow reading to start first
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list");

                Thread.sleep(500); //Delay to allow reading to start first
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list");
            }catch (Exception e){
                System.out.println("Exeception in writer thread: " + e);
            }
        });
    }
}
