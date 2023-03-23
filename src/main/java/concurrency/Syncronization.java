package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Syncronization {

    public static void main(String[] args) throws InterruptedException {

        AtomicInteger a = new AtomicInteger(0);
        Thread t = new Thread(a::getAndIncrement);
        Thread t2 = new Thread(a::getAndIncrement);
        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println(a);

    }

    }

