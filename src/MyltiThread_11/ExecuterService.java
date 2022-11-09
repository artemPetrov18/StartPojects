package MyltiThread_11;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuterService {
/*
* ThreadPoll eto pool threadov
*Executors.newFixedThreadPool
* Executors.newSingleThreadExecutor();
*Всегда нодо shutdown
*awaitTermination(5, TimeUnit.SECONDS)- like a join ждет пока закончиться
*
*
* */

    public static void main(String[] args) throws InterruptedException {
       // ExecuterService executerService=new ThreadPoolExecutor(); - так в основном не делаю, а используют фабричние методы
        ExecutorService executerService= Executors.newFixedThreadPool(5);
        ExecutorService executerService1= Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executerService.execute(new ThredPool());

        }

        executerService.shutdown();                 // надо обязательно остановить

        executerService.awaitTermination(5, TimeUnit.SECONDS);

        for (int i = 0; i < 5; i++) {
            executerService1.execute(new ThredPool1());

        }

        executerService1.shutdown();
        System.out.println("main ends");
    }
}


class ThredPool implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThredPool1 implements Runnable{


    @Override
    public void run() {
        System.out.println("Thread.currentThread().getName()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
