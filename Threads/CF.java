package Threads;

import java.util.concurrent.CompletableFuture;

public class CF {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() ->{
            try{
                Thread.sleep(5000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return "ok";
        });
        System.out.println("Main");
    }
}
