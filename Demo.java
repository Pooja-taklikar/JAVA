//public class Demo {
//
//    public static void main(String[] args) {
//        Dog dog = new Dog("Pooja");
//// 		System.out.println("calling", dog);
//    }
//}
//
//class Animal {
//    Animal(String name) {
//        System.out.println("Animal constructor " + name);
//    }
//}
//
//class Dog extends Animal {
//    Dog(String name) {
//        super(name); // calls parent class constructor (must be the first line)
//        System.out.println("Dog constructor " + name);
//    }
//}


//class Parent {
//    static void greet() {
//        System.out.println("Hello from Parent");
//    }
//
//    void sayHi() {
//        System.out.println("Hi from Parent");
//    }
//}
//
//class Child extends Parent {
//    static void greet() {
//        System.out.println("Hello from Child");
//    }
//
//    @Override
//    void sayHi() {
//        System.out.println("Hi from Child");
//    }
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        Parent p = new Child();
//
//        p.greet();   // OUTPUT?
//        p.sayHi();   // OUTPUT?
//    }
//}

class Outer {
    static int x = 10;   // static variable

    // Static nested class
    static class Inner {
        void display() {
            System.out.println("x = " + x); // Accessing Outer.x
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        // To create an object of static nested class:
        Outer.Inner inner = new Outer.Inner();
        inner.display();
        System.out.println(Outer.x);

    }
}