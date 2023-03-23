package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExp {
    public static void main(String[] args) {

            ExecutorService es= Executors.newFixedThreadPool(4);

            es.submit(()->{
                for(int i=0;i<10;i++){
                    try {
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName()+ " :" +i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            });

            es.submit(()->{
                for(int i=0;i<10;i++){
                    try {
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName()+ " :" +i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            });
    }
}
