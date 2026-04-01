public class ThreadDemo {
    public static void main(String[] args) {
        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();
        for( ; ; ){
            System.out.println("Hello");
        }
    }
}
