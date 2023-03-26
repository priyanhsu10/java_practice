package concurrency;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExp {
    public static void main(String[] args) throws IOException {

        System.out.println(Runtime.getRuntime().availableProcessors());
            ExecutorService es= Executors.newFixedThreadPool(8);
        ArrayBlockingQueue q= new ArrayBlockingQueue<Integer>(5);

            es.execute(()->{
                for(int i=0;i<10;i++){
                    try {
                        Thread.sleep(500);
                       q.add(i);
                        System.out.println("added +"+i);
                        System.out.println(Thread.currentThread().getName()+ " :" +i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            });

            es.execute(()->{
                for(int i=0;i<10;i++){
                    try {
                        Thread.sleep(500);
                        ;
                        System.out.println("get from queue +"+ q.poll());
                        System.out.println(Thread.currentThread().getName()+ " :" +i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            });
            es.shutdown();
    }
}
