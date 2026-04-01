import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
//    public static void main(String[] args) {
//        int[] numerator = {10,200,30,40};
//        int[] denominators = {1,2,0,4};
//        for(int i = 0; i < numerator.length;i++){
//            System.out.println(divide(numerator[i],denominators[i]));
//
//        }
//    }
//    public static int divide(int a, int b){
//        try{
//            return a/b;
//        }catch (ArithmeticException e){
//            System.out.println(e);
//            return -1;
//        }
//    }

//    public static void main(String[] args) {
//        try{
//            level1();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
////        level1();
//
//    }
//
//    public static void level3(){
//        int[] array = new int[5];
//        array[5] = 10;
//    }
//
//    public static void level2(){
//        level3();
//    }
//
//    public static void level1(){
//        level2();
//    }

//    public static void main(String[] args) throws IOException {
//        method2();
//        System.out.println("Hello");
//    }
//
//    public static void method2() throws FileNotFoundException {
//        method1();
//    }
//    public static void method1() throws FileNotFoundException {
//        FileReader fileReader = new FileReader("a.txt");
//    }
//public static void main(String[] args) throws FileNotFoundException {
//    method2();
//    System.out.println("Hello");
//}
//
//    public static void method2() throws FileNotFoundException {
//        method1();
//    }
//    public static void method1() throws FileNotFoundException {
//        try {
//            FileReader fileReader = new FileReader("a.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("FILE NOT FOUND");
//            throw new FileNotFoundException("Oops");
//        }
//    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10);
        try{
            bankAccount.withdraw(11);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
