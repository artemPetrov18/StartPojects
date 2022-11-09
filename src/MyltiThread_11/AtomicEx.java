package MyltiThread_11;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEx {
    /*
    * Atomarnie operazii можно исользовать вместо синхронайз
    *  static AtomicInteger atomicInteger=new AtomicInteger(0);
    *
    *
    *
    *
    *
    * */


    static AtomicInteger atomicInteger=new AtomicInteger(0);
    public static void increm(){
      //  atomicInteger.incrementAndGet();
        atomicInteger.addAndGet(5);
       // atomicInteger.decrementAndGet();
    }
    public static void main(String[] args) throws InterruptedException {
        Thread th1=new Thread(new Lopo());
        Thread th2=new Thread(new Lopo());
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(atomicInteger);
    }
}

class Lopo implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicEx.increm();
        }

    }
}






