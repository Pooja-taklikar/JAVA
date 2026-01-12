import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private double gpa;

     public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
//class StringLengthComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String s1, String s2) {
//        return s2.length() - s1.length();
//    }
//}
//
//class MyComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
////        Integer give order of element
////        negative integer -> o1,o2
////        equal integer to both we will give same preference
////        positive integer  -> o2,o1
//        return o2 - o1;
//    }
//}
// 4 5
public class ComparatorDemo {
    public static void main(String[] args){

        List<Student>  students = new ArrayList<>();
        students.add(new Student("Alice",3.5));
        students.add(new Student("bob",3.7));
        students.add(new Student("Charliie",3.5));
        students.add(new Student("Akshit",3.9));

//        students.sort((a,b) ->{
//            if(b.getGpa() - a.getGpa() > 0){
//                return 1;
//            } else if (b.getGpa() - a.getGpa() < 0) {
//                return -1;
//            }else{
////                return 0;
//                return a.getName().compareTo(b.getName());
//            }
//        });

//        In java 8 we can do like below
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa)
                .reversed().thenComparing(Student::getName);
        students.sort(comparator);
        for (Student s : students){
            System.out.println(s.getName()+ " " +s.getGpa());
        }



//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(1);
//        list.add(3);

//        list.sort(null); // By default sort in ascending order
//        If we want to Sort in desc order
//        list.sort(new MyComparator());
//        list.sort((a,b) -> b - a);
//        System.out.println(list);

//        List<String> words = Arrays.asList("banana","apple","date");
//        words.sort(null); // By default sort in ascending order
//        System.out.println(words);

//       Sort words by it's length we will use camparator
//        Inside comparator having compare method which will take two argument
//        of same type and determine their order

//        words.sort(new StringLengthComparator()); // Sort by it's Length
//        words.sort((a,b) -> a.length() - b.length());
//        System.out.println(words);
    }
}
