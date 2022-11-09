package MyltiThread_11;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schudle_Cache {


    public static void main(String[] args) throws InterruptedException {
/*
*       schedule(task,delay,timeunit)
*       delay- время посло которого оно будет выполнено
*
*        scheduleAtFixedRate(task,initialdelay,peridod,timeunit)
*           initialdelay- время посло которого оно будет выполнено
*           peridod -время от начала выполнение до начала следущего, ксли время выполнение будет больше чем peridod то начало следущего будет сразуже после преведущего
*
*           scheduleWithFixedDelay(task,initialdelay,delay,timeunit);
*           delay - задержка между віполнениями
*
*
*           newCachePool - создает потоки по надобности если нету свободны то он создает новый а если новый не занят то он удаляет его
* */




        ScheduledExecutorService ex1= Executors.newScheduledThreadPool(5);
        ex1.execute(new ThredPool3());
        ex1.schedule(new ThredPool3(),1, TimeUnit.SECONDS);
        ex1.scheduleAtFixedRate(new ThredPool3(),2,2,TimeUnit.SECONDS);
        ex1.scheduleWithFixedDelay(new ThredPool3(),2,2,TimeUnit.SECONDS);
        Thread.sleep(20000);
        ex1.shutdown();


    }
}





class ThredPool3 implements Runnable{


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