package Threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfservices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfservices);
        CountDownLatch latch = new CountDownLatch(numberOfservices);  //(latch means lock)
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();
//        Future<String> future1 = executorService.submit(new DependentService());
//        Future<String> future2 = executorService.submit(new DependentService());
//        Future<String> future3 =executorService.submit(new DependentService());
//        future1.get();
//        future2.get();
//        future3.get();
        System.out.println("All dependent service finished. Starting main service....");
        executorService.shutdown();
//            Callable<Integer> callable1 = () ->{
//                System.out.println("Task 1");
//                return 1;
//            } ;
//            Callable<Integer> callable2 = () -> {
//                System.out.println("Task 2");
//                return 1;
//            };
//            Callable<Integer> callable3 = () -> {
//                System.out.println("Task 3");
//                return 1;
//            };
//
//        List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
//        List<Future<Integer>> futures = executorService.invokeAll(list);
//        executorService.shutdown();
//        System.out.println("Hello world");
//        Future<Integer> submit = executorService.submit(() -> 1 + 2);
//        Integer i = submit.get();
//        System.out.println("Sum is " + i);
//        executorService.shutdown();
//        Thread.sleep(1);
//        System.out.println(executorService.isShutdown());
//        System.out.println(executorService.isTerminated());

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<Integer> submit = executorService.submit(() -> 42);
//        System.out.println(submit.get());
////        if(submit.isDone()){
////            System.out.println("Task is done !");
////        }
//
//        executorService.shutdown();
//        long startTime = System.currentTimeMillis(); // 1 jan 1970
////        Thread[] threads = new Thread[9];
//        ExecutorService executor = Executors.newFixedThreadPool(9);
//        for(int i = 1;i < 10;i++){
//            int finalI = i;
////            threads[i - 1] = new Thread(
////                    () ->{
////                        long result = factorial(finalI);
////                        System.out.println(result);
////                    }
////            );
////            threads[i-1].start();
//            executor.submit( () ->{
//                        long result = factorial(finalI);
//                        System.out.println(result);
//                    });
////            System.out.println(factorial(i));
//        }
////        for (Thread thread : threads){
////            try {
////                thread.join();
////            } catch (InterruptedException e) {
////                Thread.currentThread().interrupt();
////            }
////        }
//        executor.shutdown();
//        try {
//            executor.awaitTermination(100, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Total time: "+ (System.currentTimeMillis() - startTime));
//    }
//
//    private static long factorial(int n){
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            throw new RuntimeException(e);
//        }
//        long result = 1;
//        for(int i = 1; i <= n;i++){
//            result *= i;
//        }
//        return result;

    }
}

class DependentService implements Callable<String>{

    private final CountDownLatch latch;

    public DependentService(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            System.out.println(Thread.currentThread().getName() + " Service started");
            Thread.sleep(2000);
        } finally {
            latch.countDown();
        }
        return "ok";
    }
}
