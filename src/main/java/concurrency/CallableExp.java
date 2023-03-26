package concurrency;

import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.*;

public class CallableExp {
    public static void main(String[] args) {

        ExecutorService service = Executors.newScheduledThreadPool(5);
        List<Future<String>> futures = new ArrayList<>();
        Vector<Integer> test = new Vector<>();
        for (int i = 0; i < 10; i++) {

            futures.add(service.submit(new Task()));
        }

        futures.forEach(x-> {
            try {
                System.out.println(x.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

        });
    service.shutdownNow();
    }
    public static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            return String.valueOf(Math.random() +" : "+ Thread.currentThread().getName());
        }
    }

}
