package Threads;

class SharedObj{
    private volatile boolean flag = false;  //volatile taking data from memory and it will not create local copy
//    atomicity/isolation
    public void setFlagTru() {
        System.out.println("Writer Thread made the flag true");
        flag = true;
    }

    public void printIfFlagTrue() {
        while (!flag){

        }
        System.out.println("Flag is true !");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObj.setFlagTru();
        });

        Thread readerThread = new Thread(()->{
            sharedObj.printIfFlagTrue();
        });

        writerThread.start();
        readerThread.start();
    }
}
