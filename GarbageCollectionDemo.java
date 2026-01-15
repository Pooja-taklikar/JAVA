import java.lang.ref.WeakReference;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
////       Strong reference
//                |
//        Phone phone = new Phone("Apple","16 pro max");
//        System.out.println(phone);
//        phone = null;
////        Once we will put phone = null , memory corresponding to reference is no use
////        JVM will destroy that memory that is called garbage collection;
//        System.out.println(phone);

//                           Weak reference
//                                  |
        WeakReference<Phone> phoneWeakReference =new WeakReference<>( new Phone("Apple","16 pro max"));
        System.out.println(phoneWeakReference.get());
        System.gc();  //We are telling JVM that you can do garbage collection

        try{
            Thread.sleep(10000);
        }catch (Exception ignored){

        }
        System.out.println(phoneWeakReference.get());
    }
}

class Phone{
    String brand;
    String model;

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
