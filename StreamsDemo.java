import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class StreamsDemo {
    public static void main(String[] args) {
        //lambda expression is used implement functional interface
        //functional interface which is having only one abstract method
        //Lambda expression is an anonymous function (no name, no return type. no access modifier)

//        Thread t1 = new Thread(new Task());
        Thread t1 = new Thread(()->{
            System.out.println("hello");
        });
        MathOperation sumOperation = (a, b) -> a + b;
        MathOperation subtractOperation = (a, b) -> a - b;
        int res = sumOperation.operate(2,4);
        System.out.println(res);

        //Predicate is function interface(Boolean valued function)
        //if we want to check something and use predicate
        // predicate will hold condition
        Predicate<Integer> isEven= x -> x%2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWihU = x -> x.toLowerCase().endsWith("u");
        System.out.println(isWordStartingWithA.test("ashu"));

        Predicate<String> and = isWordStartingWithA.and(isWordEndingWihU);
        System.out.println(and.test("Ashwini"));

        // Function --> work for you
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer,Integer> triplet = x -> x * 3;

        System.out.println(doubleIt.andThen(triplet).apply(20));
        System.out.println(doubleIt.compose(triplet).apply(20));

        Function<Integer, Integer> identity = Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2); // it will give same result

        //Consumer
        Consumer<Integer> print = (x) -> System.out.println(x);
        print.accept(51);

        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        //Supplier
        Supplier<String> giveHelloWorld = () -> "Hello WOrld";
        System.out.println(giveHelloWorld.get());

        //Combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
        //BiPredicate,BiConsumer,BiFunction

        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5,5));

        BiConsumer<Integer,String> biConsumer = (x,y) ->{
            System.out.println(x);
            System.out.println(y);
        };

        BiFunction<String,String,Integer> biFunction = (x,y) -> (x + y).length();
        System.out.println(biFunction.apply("a","bc"));

        //Unary and Binary operator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x,y) -> x + y;

        //Method reference --> use Method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ram","Shyam","Ghansham");

        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println); //Method Reference

    }

}

//class Task implements Runnable{
//
//    @Override
//    public void run() {
//        System.out.println("hello");
//    }
//}

class SumOperation implements MathOperation{

    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}

