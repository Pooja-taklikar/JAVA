import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice",3.5));
        students.add(new Student("bob",3.7));
        students.add(new Student("Charliie",3.5));
        students.add(new Student("Akshit",3.9));

        students.sort(null); //give error if we haven't implement comparable in student class
        System.out.println(students);
        List<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(99);
        num.sort(null);
        System.out.println(num);
    }


}
